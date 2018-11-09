
public class Account { 
	
	private String name;
	private double balance;
	private int acnum;
	
	public Account(String name, int acnum, double balance) {
		this.name = name;
		this.acnum = acnum;
		if (balance> 0.0) {
			this.balance = balance;
		}
	}
	
	public void withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("withdraw amount is bigger than the balance");
		}
		else	balance = balance - amount;
		
	}
	
	public boolean authenticate(int acnum_input) {
		if (acnum_input == this.acnum) {
			return true;
		}
		else return false;
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAcnum() {
		return acnum;
	}

	public void setAcnum(int acnum) {
		this.acnum = acnum;
	}

}
