package task_5;

import java.util.Scanner;

public class Q5_Grade_System {

	private static Scanner sc;

	public static void main(String[] args) {
		
        int marks ;
		
		sc = new Scanner(System.in);
	    System.out.print("Enter the marks of the student = ");
	    
	    marks=sc.nextInt();
	    
	    if (marks >100 || marks <0) {
			System.out.println("Invaild Input");
	    } else if (marks >=90 && marks <=99) {
	    	System.out.println("Grade A");
		} else if (marks >=80 && marks <=89) {
			System.out.println("Grade B");
		} else if (marks >=70 && marks <=79) {
			System.out.println("Grade C");
		} else if (marks >=60 && marks <=69) {
			System.out.println("Grade D");
	    } else if (marks >=50 && marks <=59) {
			System.out.println("Grade E");
		} else if (marks <50) {
			System.out.println("Grade F");
		} else 
	    	System.out.println("Grade S");
	    }		
    }


