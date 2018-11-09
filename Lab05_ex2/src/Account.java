
public class Account { 
	
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		
		if (balance> 0.0) {
			this.balance = balance;
		}
	}
	
	void deposit(double depositAmount) {
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	boolean transfer (Account b, double amt) {
		if(this.balance<amt) {
			return false;
		}
		else {
			this.balance -= amt;
			b.balance += amt;
			return true;
		}
	}
	
	double getBalance() {
		return balance;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}

