package codePractice.Strings.Easy_problems;

public class Test {
	
	
	static int pal_check(String s, int left, int right) {
		
		// Base case
		if(left >= right)
			return 1;
		
		if(s.charAt(left) != s.charAt(right))
			return 0;
		
		return pal_check(s, left+1, right -1);
		
	}
	
	// Function to check if a string is a palindrome
	static int isPal(String s) {
		int left = 0;
		int right = s.length()-1;
		return pal_check(s, left, right);
	}
	
	public static void main(String[] args) {
		
        String s = "abba";
        System.out.println(isPal(s));
		
	}

}
