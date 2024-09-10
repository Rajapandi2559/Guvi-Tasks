package task_6;

public class SavingsAccount extends BankAccount { // Child class SavingsAccount
	
	public SavingsAccount(String accountNumber,double balance) {
			super(accountNumber,balance);
		}
	@Override
	public void withdraw(double amount) {
		if(getBalance() - amount < 1000) {
			System.out.println("Minimum balance of Rs.1000 required!");
		} else {
			super.withdraw(amount);
		}
	}
}

	


