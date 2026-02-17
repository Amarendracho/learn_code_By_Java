package codePractice.Strings;

public class Palindrom {

	public static String pal_Check(String str) {

		String revarse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revarse += str.charAt(i);
		}
		if (!str.equals(revarse))
			return "NOT PALINDROM";

		return "PALINDROM";
	}

	public static void main(String[] args) {
		System.out.println(Palindrom.pal_Check("NANNA")); 
	}
}
