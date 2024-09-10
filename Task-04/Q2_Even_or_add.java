package task_4;

import java.util.Scanner;

public class Q2_Even_or_add {

	public static void main(String[] args) {
		
		 try (Scanner reader = new Scanner(System.in)) {
			
			 System.out.println("Enter a number: ");
			
			int num = reader.nextInt();
			
			if(num % 2 == 0) 
				
				System.out.println(num + " is even number");
			
			else 
				System.out.println(num + " is odd number");			
	}
}
}
	