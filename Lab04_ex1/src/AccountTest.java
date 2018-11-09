import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account("Lee", 1111, 1000.0);
		Account account2 = new Account("Kim", 2222, 2000.0);
		Account account3 = new Account("Hong", 3333, 3000.0);
		
		double depositAmount;
		double withdrawAmount;

		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", 
				account2.getName(), account2.getBalance());
		System.out.printf("%s balance: $%.2f%n", 
				account3.getName(), account3.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		 //*******authenticate account1*******
		System.out.println("Enter account number of account1: ");
		int acnum_input_1 = input.nextInt();
		if (!account1.authenticate(acnum_input_1)) {
			System.out.println("wrong account number");
			System.out.println("can't access to account1.");
		}
		else System.out.println("correct account number");
		
		System.out.println();
		
		//*******authenticate account2*******
		System.out.println("Enter account number of account2: ");
		int acnum_input_2 = input.nextInt();
		if (!account2.authenticate(acnum_input_2)) {
			System.out.println("wrong account number");
			System.out.println("can't access to account2.");
		}
		else System.out.println("correct account number");
		
		System.out.println();
		
		//*******authenticate account3*******
		System.out.println("Enter account number of account3: ");
		int acnum_input_3 = input.nextInt();
		if (!account3.authenticate(acnum_input_3)) {
			System.out.println("wrong account number");
			System.out.println("can't access to account3.");
		}
		else System.out.println("correct account number");
		
		System.out.println();
		
		//*******account1 deposit*******
		if(account1.authenticate(acnum_input_1)) {
		
			System.out.println("Enter deposit amont for account1: ");
			depositAmount = input.nextDouble();
			System.out.printf("%nadding %.2f to account1 balance%n%n",
					depositAmount);
			account1.deposit(depositAmount);

			System.out.printf("%s balance: %.2f%n", 
					account1.getName(), account1.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account2.getName(), account2.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account3.getName(), account3.getBalance());
		}
		
		System.out.println();
		
		//*******account2 deposit*******
		if(account2.authenticate(acnum_input_2)) {
		
			System.out.println("Enter deposit amont for account2: ");
			depositAmount = input.nextDouble();
			System.out.printf("%nadding %.2f to account2 balance%n%n",
					depositAmount);
			account2.deposit(depositAmount);

			System.out.printf("%s balance: %.2f%n", 
					account1.getName(), account1.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account2.getName(), account2.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account3.getName(), account3.getBalance());
		}
		
		System.out.println();
		
		//*******account3 deposit*******
		if(account3.authenticate(acnum_input_3)) {
		
			System.out.println("Enter deposit amont for account3: ");
			depositAmount = input.nextDouble();
			System.out.printf("%nadding %.2f to account3 balance%n%n",
					depositAmount);
			account3.deposit(depositAmount);

			System.out.printf("%s balance: %.2f%n", 
					account1.getName(), account1.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account2.getName(), account2.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account3.getName(), account3.getBalance());
		}
		
		System.out.println();
		
		//*******account1 withdraw*******
		if(account1.authenticate(acnum_input_1)) {
			System.out.println("Enter withdraw amont for account1: ");
			withdrawAmount = input.nextDouble();
			System.out.printf("%nsubstracting %.2f to account1 balance%n%n",
					withdrawAmount);
			account1.withdraw(withdrawAmount);

			System.out.printf("%s balance: %.2f%n", 
					account1.getName(), account1.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account2.getName(), account2.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account3.getName(), account3.getBalance());
		}
		
		System.out.println();
		
		//*******account2 withdraw*******
		if(account2.authenticate(acnum_input_2)) {
			System.out.println("Enter withdraw amont for account2: ");
			withdrawAmount = input.nextDouble();
			System.out.printf("%nsubstracting %.2f to account2 balance%n%n",
					withdrawAmount);
			account2.withdraw(withdrawAmount);

			System.out.printf("%s balance: %.2f%n", 
					account1.getName(), account1.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account2.getName(), account2.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account3.getName(), account3.getBalance());
		}

		System.out.println();
		
		//*******account3 withdraw*******
		if(account3.authenticate(acnum_input_3)) {
			System.out.println("Enter withdraw amont for account3: ");
			withdrawAmount = input.nextDouble();
			System.out.printf("%nsubstracting %.2f to account3 balance%n%n",
					withdrawAmount);
			account3.withdraw(withdrawAmount);

			System.out.printf("%s balance: %.2f%n", 
					account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f%n", 
					account2.getName(), account2.getBalance());
			System.out.printf("%s balance: %.2f%n", 
					account3.getName(), account3.getBalance());
		}
	}

}
