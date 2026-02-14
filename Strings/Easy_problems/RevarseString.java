package codePractice.Strings.Easy_problems;

public class RevarseString {

	// Using backward traversal – O(n) Time and O(n) Space
	static String revarseStr(String s) {

		String r = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			r += s.charAt(i);
		}

		return r;

	}
	
	static String revarseString(String s) {
		
		StringBuffer bf = new StringBuffer();
		
		for(int i = s.length()-1; i>=0; i--) {
			bf.append(s.charAt(i));
		}
		
		return bf.toString();
	}

	public static void main(String[] args) {
		
		System.out.println(revarseStr("amar"));
		
		System.out.println(revarseString("amarendra"));

//		Using Two Pointers - O(n) Time and O(1) Space
//		Using Recursion - O(n) Time and O(n) Space
//		Using Stack - O(n) Time and O(n) Space
//		Using Inbuilt methods - O(n) Time and O(1) Space
	}

}
