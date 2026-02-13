package codePractice.Strings;

// all methods 
public class Demo {
	public static void main(String[] args) {
		
		String name = "JAVA LANGUAGE";
		
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.substring(5));
		System.out.println(name.substring(5,9));
		System.out.println(name.concat(" "+"POWERFUL"));
		System.out.println(name.indexOf('L'));
		System.out.println(name.lastIndexOf('G'));
		
		String cl1 = "USD";
		String cl2 = "USD";
		System.out.println(cl1 == cl2);
		System.out.println(cl1.equals(cl2));
		
		String country1 = "INDIA";
		String country2 = "iNdia";
		System.out.println(country1 == country2);
		System.out.println(country1.equalsIgnoreCase(country2));
		
		String lang = "JAVA LANGUAGE";
		String subject = "computer science";
		System.out.println(lang.toLowerCase());
		System.out.println(subject.toUpperCase());
		
		
	}

}
