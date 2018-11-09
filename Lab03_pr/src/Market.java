import java.util.Scanner;
public class Market {
	static int[] unit_price = {5,2,7,9,3,4,1,8,9,4};
	static int[] unit_stock = {3,3,3,3,3,3,3,3,3,3};
	static int typ;
	static int[] stk = new int[10];
	static int sum_price = 0;

	static Scanner input = new Scanner(System.in);
	
	static void view_unit() {
		System.out.printf("Which Item do you want to see? (1~10): ");
		int typ_num = input.nextInt();
		if (typ_num>0 && typ_num<=10) 
			System.out.println("Type : " + (typ_num)
					+ " Price: $" + unit_price[typ_num-1]);
		else System.out.println("We don't have the item.");
	}
	
	static void purchase() {
		
			System.out.printf("Insert a number of type which you want to buy: ");
			typ = input.nextInt();
			if(typ < 1 && typ >10) {
				System.out.println("Please select between 1 to 10.");
				}
			else unit_stock[typ-1]--;
				if(unit_stock[typ-1] < 0) {
					System.out.println("more than stock");
				}
				else
					stk[typ-1]++;
					
	}
	static void calculate() {
		
		for(int i=0; i<10; i++) {
			if (stk[i] != 0 ) {
				System.out.println(stk[i] + " items from product type" + (i+1));
				sum_price += stk[i]*unit_price[i];
			}
		}
		
		System.out.println("The total price is : $" + sum_price);
	}
	public static void main(String[] args) {
		
		int menu;
		
		while(true) {
			System.out.println();
			System.out.println("=== Please select menu. ===");
			System.out.println("1. View the unit price.");
			System.out.println("2. Add a puchasing product.");
			System.out.println("3. Calculate the total price.");
			menu = input.nextInt();
			if(menu == 1) view_unit();
			else if (menu == 2) purchase();
			else if (menu == 3) {
				calculate();
				break;
				}
			else
				System.out.println("Please select among 1,2, and 3.");
		}
	}
}
