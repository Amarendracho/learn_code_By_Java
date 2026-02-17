package codePractice.Strings;

public class Palindrom {

	public static String pal_Check(String str){
		return str.equals(new StringBuffer(str)
				.reverse()
				.toString()) ? "PALI" : "N-PALI";
	}
	
	static int palindrom_ch(String name) {
		return name.equals(new StringBuffer(name)
				.reverse()
				.toString()) ? 1 : 0;
	}


	public static void main(String[] args) {
		System.out.println(Palindrom.pal_Check("nanan"));
	}
}  