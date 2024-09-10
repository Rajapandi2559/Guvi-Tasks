package task_6;

public class Main_Account {

	public static void main(String[] args) {
		
		System.out.println("Create a Bank Account (A/c No : A12345) with initial balance of Rs.2000");
		BankAccount A12345 = new BankAccount("A12345", 2000);
		
		System.out.println("\nDeposite Rs.1,500 into account");
		A12345.deposit(1500);
		
		System.out.println("New balance after depositing Rs.1,500 : Rs" +A12345.getBalance());
		System.out.println("\nWithdraw Rs.2,400 from account A12345 :");
		
		A12345.withdraw(2400);
		System.out.println("New balance of after withdrawing Rs.2,400 : Rs" +A12345.getBalance());
		
		System.out.println("\nTry to withdraw Rs.1,200 from A12345");
		A12345.withdraw(1200);
	}

}
