package codePractice.Strings.BasicProblems;

import java.util.Scanner;

// Count Vowels and Consonants

public class VolwelsCount {

	static void volwelsCount() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a String: ");
			String input = scan.nextLine().trim().toLowerCase();

			int vowel_Count = 0;
			int consonants_Count = 0;
			String volwes = "aeiou";
			for (int i = 0; i <= input.length() -1; i++) {
				char ch = input.charAt(i);
				
				if(ch >= 'a' && ch <= 'z') {
					if(volwes.indexOf(ch) == 1) {
						vowel_Count++;
					}else {
						consonants_Count++;
					}
				}

			}
			System.out.println("vowel_Count: " + vowel_Count);
			System.out.println("consonants_Count: " + consonants_Count);
		}

	}

	public static void main(String[] args) {
		volwelsCount();
	}

}
