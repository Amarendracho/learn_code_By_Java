package codePractice.Strings.BasicProblems;

import java.util.Scanner;

// Convert Lowercase to Uppercase (without using toUpperCase())

public class ConvertLowerToUpper {
	
	// with toUpperCase()
	static void toUpper() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a String");
			String toUpper= scan.nextLine().toUpperCase();
			System.out.println(toUpper);
		}
	}

	public static void main(String[] args) {
		toUpper();
	}
}
