package codePractice.Strings;

public class Palindrom {

	public static boolean pal_Check(String str) {

		String revarse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revarse += str.charAt(i);
		}

		return str.equals(revarse);
	}

	public static void main(String[] args) {
		System.out.println(Palindrom.pal_Check("dad")); 
	}
}
