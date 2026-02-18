package codePractice.Strings.BasicProblems;

public class RevarseString {
	public static void main(String[] args) {
		
		String name = "amar";
		System.out.println(name.length());
		for(int i = name.length()-1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		
	}

}
