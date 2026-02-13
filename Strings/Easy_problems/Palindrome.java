package codePractice.Strings.Easy_problems;

public class Palindrome {

	// Brute force solution
	public static boolean palindrome_Check(String name) {
		
		if(name == null)
			return false;
		
		String reverse = "";
		
		for(int i = name.length() -1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		return name.equals(reverse);
	}
	
	public static boolean revarse(String name) {
		
		String rev = "";
		for(int i = name.length()-1; i >=0; i--) {
			rev += name.charAt(i);
		}
		
		return name.equals(rev);
	}
		
	public static void main(String[] args) {

		System.out.println(Palindrome.palindrome_Check("java"));
		System.out.println(Palindrome.revarse("java"));
		//System.out.println("abba".length());

	}

}
  