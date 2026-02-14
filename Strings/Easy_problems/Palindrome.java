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

		if (str == null)
			return false;

		String rev = new StringBuffer(str).reverse().toString();

		return str.equals(rev);

	}

	// using whike loop optimized T - O(n) S - O(1) - no extra datastructure used
	public static String pal_Check(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			if (s.charAt(left) != s.charAt(right))
				return "NOT PAL";

			left++;
			right--;
		}
		return "PAL";
	}

	// Optimization of two pointers approach - O(n) time and O(1) space
	static boolean pali_Check(String s) {

		int len = s.length();
		for (int i = 0; i < len / 2; i++) {

			if (s.charAt(i) != s.charAt(len - i - 1))
				return false;
		}

		return true;
	}

	// return int
	static int paliCheck(String s) {

		if (s == null)
			return 0;

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return 0;

			left++;
			right--;

		}
		return 1;
	}

	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		System.out.println(pal.palindrome_Check("chehc"));
		// Time: O(n), Space: O(n)

		System.out.println(pali_check("poop"));
		// Time: O(n), Space: O(n)

		System.out.println(pal_Check("moom"));

		System.out.println(pali_Check("abcddcba"));

		System.out.println(paliCheck("noon"));

	}

}
