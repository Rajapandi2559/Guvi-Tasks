package task_5;

import java.util.Scanner;

public class Q7_Largest_Number {

	public static void main(String[] args) {
		
		int x,y,z;
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter the First number = ");
			x = s.nextInt();
			System.out.print("Enter the Second number = ");
			y = s.nextInt();
			System.out.print("Enter the Third number = ");
			z = s.nextInt();
		}
		if (x>y && x>z) {
			System.out.println("Largest number is = "+x);
		} else if(y>z) {
			System.out.println("Largest number is = "+y);
		} else {
			  System.out.println("Largest number is = "+z); 
		  }
		}
	}


