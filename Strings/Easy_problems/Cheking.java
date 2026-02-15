package codePractice.Strings.Easy_problems;

public class Cheking {
	
	static int pal_check(String str) {
		
		return str.equals(new StringBuffer(str)
				.reverse()
				.toString()) ? 1: 0;
		
	} 
	
	public static void main(String[] args) {
		
		System.out.println(Cheking.pal_check("abba"));
	}
	

}
