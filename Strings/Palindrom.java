package codePractice.Strings;

public class Palindrom {

	public static String pal_Check(String str){
		return str.equals(new StringBuffer(str)
				.reverse()
				.toString()) ? "PALI" : "N-PALI";
	}
	


	public static void main(String[] args) {
		System.out.println(Palindrom.pal_Check("nanan"));
	}
}  