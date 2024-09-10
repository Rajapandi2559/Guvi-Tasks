package task_5;

import java.util.Scanner;

public class Q4_Star_Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the n vaue = ");
		
		int n = sc.nextInt(),i,j;
    
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=n;j++) {
			
				if(i==j || i+j==n+1)
					System.out.print("* ");
				else 
					System.out.print("  ");
				}
				    System.out.println();
			}
		}
	}




