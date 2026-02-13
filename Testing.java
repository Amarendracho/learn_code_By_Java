package codePractice;

public class Testing {
	
	String name;

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		
		Testing test = new Testing();
		test.name = "Checking";
		System.out.print(test.name);

	}
}
