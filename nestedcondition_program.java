package javaTask1;

public class nestedcondition_program {
	public static void main (String args[]) {
		int number=10;
		String name = "pen"; 
		if (number == 10) {
			if (name == "pen") {
				System.out.println("Accepted");
			}
			else if (name == "paper") {
				System.out.println("Rejected");
			}
			else {
				System.out.println("Fullfilled");
			}
		}
		else {
			System.out.println("Valid");
		}
		
	}

}
