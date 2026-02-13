package codePractice.Strings;

public class Basics {
	
	String fname, lname;
	
	Basics(String fname,String lname){
		this.fname = fname;
		this.lname = lname;
	}

	
	public String toString() {
		return "My First Name is: " +fname + " Last Name: "+ lname;
	}

	public static void main(String[] args) {
		
		Basics basics = new Basics("Amarendra", "Kadambala");
		System.out.println(basics);
		
	}
}
