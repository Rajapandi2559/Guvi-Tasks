package task_4;

import java.util.Scanner;

public class Q9_Senior_Citizen {

	private static Scanner sc;

	public static void main(String[] args) {
	
		int age ;
		
		sc = new Scanner(System.in);
	    System.out.println("Enter the age of the person =");
	    
	    age=sc.nextInt();
	    
	    if(age>=60) {
	    	
	    	System.out.println("This person is Senior citizen");
	    }
	    else 
	    {
	    	
	    	System.out.println("This person is not a Senior citizen");
	    }

	}

}
