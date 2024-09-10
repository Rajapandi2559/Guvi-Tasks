package task_4;

import java.util.Scanner;

public class Q10_Count_number_of_digit {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int count = 0;
		System.out.println("Enter a number - ");
		int num = sc.nextInt();
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("Number of digits in the entered integer are = "+count);
		}

	}


