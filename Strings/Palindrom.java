package codePractice.Strings;

public class Palindrom {

	public static void pal_Check(String str){
		try {
			if(str == null)
			System.err.println("input can't be null");
		}
		catch (NullPointerException e){
			System.out.println(e.getStackTrace());
		}
		
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) 
				System.out.println("NOT - PALI");

			left++;
			right--;
		}
		System.out.println("PALI");

	}

	public static void main(String[] args) {
		Palindrom.pal_Check(null);
	}
} 