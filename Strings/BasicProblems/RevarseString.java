package codePractice.Strings.BasicProblems;

import java.util.Scanner;

public class RevarseString {

	static String revarseStr(String name) {
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		return rev;
	}

	// taking input
	static void revarse() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a name: ");
			String name = scan.nextLine();
			for (int i = name.length() - 1; i >= 0; i--) {
				System.out.print(name.charAt(i));
			}
		}

	}

	public static void main(String[] args) {

		System.out.println(RevarseString.revarseStr("amar"));
		RevarseString.revarse();
	}

}
