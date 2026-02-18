package codePractice.Strings.BasicProblems;

import java.util.Scanner;

public class PalindromeCheck {

	public static String palCheck(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (!str.equals(rev))
			return "NOT PALINDROME";

		return "PALINDROME";
	}

	// taking input
	static String palindromeCheck() {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String input = scan.nextLine();

			int left = 0;
			int right = input.length() - 1;

			while (left < right) {
				if (input.charAt(left) != input.charAt(right))
					return "NOT PALINDROME";

				left++;
				right--;

			}
			return "PALINDROME";

		}
	}

	public static void main(String[] args) {
		System.out.println(PalindromeCheck.palCheck("jssuj"));
		System.out.println(palindromeCheck());
	}
}
