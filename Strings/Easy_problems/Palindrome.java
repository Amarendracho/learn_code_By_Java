package codePractice.Strings.Easy_problems;

public class Palindrome {

	// Brute force solution
//	public static boolean palindrome_Check(String name) {
//
//		if (name == null)
//			return false;
//
//		String reverse = "";
//
//		for (int i = name.length() - 1; i >= 0; i--) {
//			reverse += name.charAt(i);
//		}
//		return name.equals(reverse);
//	}

	public boolean palindrome_Check(String name) {

		if (name == null)
			return false;

		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		
		return name.equals(reverse);

	}

	public static void main(String[] args) {

		// System.out.println(Palindrome.palindrome_Check("java"));
		Palindrome pal = new Palindrome();
		
		System.out.println(pal.palindrome_Check("chehc"));
		

	}

}
