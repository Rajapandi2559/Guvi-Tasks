package task_4;

public class Q4_Swap {

	public static void main(String[] args) {
		
		int first = 456;
		int second = 789;
		
		System.out.println("--Before Swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number ="+second);
		
		int temporary = first;
		
		first = second;
		
		second = temporary;
		
		System.out.println("--After Swap--");
		System.out.println("First number =" + first);
		System.out.println("Second number ="+second);;

	}

}
