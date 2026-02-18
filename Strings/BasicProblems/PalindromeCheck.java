package codePractice.Strings.BasicProblems;

public class PalindromeCheck {
	
	public static String palCheck(String str) {
		
		String rev = "";
		for(int i = str.length()-1; i>= 0; i--) {
			rev += str.charAt(i);
		} 
		if(!str.equals(rev))
			return "NOT PALINDROME";
		
		return "PALINDROME";
	}
	public static void main(String[] args) {
		System.out.println(PalindromeCheck.palCheck("jssuj"));
	}
}
