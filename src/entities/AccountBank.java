package entities;

public class AccountBank {
	
	private int accountNumber;
	private String accountHolder;
	public double balance;
	
	public AccountBank(int accountNumber, String accountHolder,
			double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance= balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance= balance;
	}

	@Override
	public String toString() {
		return "Account "  
				+ accountNumber
				+ ", Holder: " 
				+ getAccountHolder() 
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

	
	public void deposit (double value){
		balance += value;
	}
	public void withdraw (double value){
		balance = balance - value - 5;
	}
		
}
