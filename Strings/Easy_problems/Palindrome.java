package codePractice.Strings.Easy_problems;

public class Palindrome {

	// brute-force (slow due to string concat)
	public boolean palindrome_Check(String name) {

		if (name == null)
			return false;

		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reverse += name.charAt(i);
		}

		return name.equals(reverse);

	}
	
	// brute-force but better (String) — StringBuilder reverse
	public static boolean pali_check(String str) {
		
		if(str == null) 
			return false;
		
		String rev = new StringBuffer(str).reverse().toString();
		
		return str.equals(rev);

	}
	
	// using whike loop optimized T - O(n) S - O(1) - no extra datastructure used

	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		System.out.println(pal.palindrome_Check("chehc"));
		// Time: O(n), Space: O(n)
		
		// using String buffer
		System.out.println(pali_check("poop"));
		// Time: O(n), Space: O(n)
		
		
	} 

}
