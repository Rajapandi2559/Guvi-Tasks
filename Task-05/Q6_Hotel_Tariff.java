package task_5;

import java.util.Scanner;

public class Q6_Hotel_Tariff {

	public static void main(String[] args) {
		
		
		int month,n;
		Float rent,t,r; // t is normal month,r is peak season
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the no of month = ");
		month=scanner.nextInt();
		
		System.out.print("Enter the room rent per day = ");
		rent=scanner.nextFloat();
		
		System.out.print("Enter the no of stayed in hotel = ");
		n=scanner.nextInt();
		
		t=rent * n;
		r=((rent+(rent*0.2f))*n);
		
		switch (month) {
		   case 1:
		   case 2:	
		   case 3:
		   case 7:
		   case 8:
		   case 9:
		   case 10:
		p(t);
		break;
		   case 4:
		   case 5:	
		   case 6:
	       case 11:
	       case 12:
	   p(r);
	    break;
	    default:
	    	System.out.println("Ivalid Input");
	    	break;
		}
		scanner.close(); }
	    public static void p(float t) {
	    	System.out.printf("Hotel Traiff is Rs.%.2f%n ", t);
	   
	}
}



