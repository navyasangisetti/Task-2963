package javaTask1;
import java.util.Scanner;

public class while_program {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int i =1;
		
		while (i <= n) {
			System.out.println(i);
			i=i+1;
		}
		input.close();
			
	}
			
}


