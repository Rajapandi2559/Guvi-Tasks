package task_5;

public class Q3_Number_Pattern {

	   public static void main(String[] args) {
		   int count = 1;
		   
		   for(int i = 1;i<=4;i++) {
			   for(int j=1;j<=i;j++,count++) {
				   System.out.print(count + " ");
			   }			   
			   System.out.println();
			   }
		   }
}

	
