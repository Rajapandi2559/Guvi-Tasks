package task_5;

import java.util.Scanner;

public class Q1_Palindrome {
	
	public static void main(String[] args) {
	
	String str,rev = "";
	try (Scanner sc = new Scanner(System.in)) {
		
		System.out.print("Enter a String = ");
		str = sc.nextLine();
	}

	int length = str.length();
	
	
	for (int i = length - 1; i >= 0; --i) 
		rev = rev + str.charAt(i);
	
	if (str.equals(rev))
		System.out.print(str + " is a Palindrome String.");
	else 
		System.out.println(str + " is a not a Palindrome String.");
	}
	
	}	



