import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 300.00);
		Account account2 = new Account("John Blue", 200.00);

		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", 
				account2.getName(), account2.getBalance());
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Jane is trying to transfer money to John.\n"
				+ "How much do you want her to transfer?\n");
		double amt = input.nextDouble();
		
		if(account1.transfer(account2, amt)) {
			System.out.println("Transfer Complete!");
		}
		else {
			System.out.println("Low Balance..");
		}
		
		System.out.println();
		
		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", 
				account2.getName(), account2.getBalance());
		
		/*System.out.print("Enter deposit amont for accoount1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n",
				depositAmount);
		account1.deposit(depositAmount);

		System.out.printf("%s balance: %.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f%n", 
				account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		
		System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance: %.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f%n", 
				account2.getName(), account2.getBalance());*/
		
		
		
		
	}

}
