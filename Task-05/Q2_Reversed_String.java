package task_5;

public class Q2_Reversed_String {

	public static void main(String[] args) {
		
		String input = "Good Morning";
		
		String reversed = "";
		
		for (int i = input.length() -1;i>=0;i--) {
			reversed +=input.charAt(i);
			
			}
		System.out.println("Original String is = "+input);
		System.out.println("Reversed String is = "+reversed);

	}

}


