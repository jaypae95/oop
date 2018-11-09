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
		
		System.out.println(account1.getAccountNo());
		System.out.println(account2.getAccountNo());
		
		
		
		
		
	}

}
