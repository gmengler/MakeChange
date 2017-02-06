package labs;

import java.util.Scanner;

public class MakingChangeBetter {
	public static void main(String[] args) {

		makeChange();

	}

	public static void makeChange() {
		Scanner scanner = new Scanner(System.in);

		double price = 0.0;
		double paid = 0.0;
		double remain = 0.0;
		String ans = "";
		
		do {
		System.out.print("What is the price of the item? ");
		price = scanner.nextDouble();
		System.out.print("How much did the customer pay? ");
		paid = scanner.nextDouble();
		remain = paid - price;
		System.out.println();

		while (paid <= price) {
			if (price > paid) {
				System.err.println("Customer did not pay enough for the item.");
				break;
			} else {
				System.out.println("Customer provided exact change for the item.");
				break;
			}
		}
		if (paid > price) {
			System.out.printf("Customer's change will be: $%.2f", remain);
			System.out.println();
		
		
		calcChange(remain);
		
		System.out.print("\nWould you like to make another transaction (Y/N)? ");
		ans = scanner.next();
		System.out.println();
		if (ans.equalsIgnoreCase("N")) {
			System.out.println("Goodbye");
		}
		}
		} while (ans.equalsIgnoreCase("Y"));

		scanner.close();
	}
	

	public static void calcChange(double remain) {
		
		String singular[] = {"twenty", "ten", "five", "one", "quarter", "dime", "nickel", "penny"};
		String plural[] = {"twenties", "tens", "fives", "ones", "quarters", "dimes", "nickels", "pennies"};
		int numBills[] = new int [8];
		int values[] = {2000, 1000, 500, 100, 25, 10, 5, 1};
		
		
		int remainderInPennies = (int)(remain*100);
		for (int i = 0; i < values.length; i++) {
			if (remainderInPennies >= values[i]) {
				numBills[i] = remainderInPennies / values[i];
				remainderInPennies = remainderInPennies % values[i];
			}
			else {
				numBills[i] = 0;
			}
		}
		for (int i = 0; i < singular.length; i++){
			if (numBills[i] > 1){
				System.out.println(numBills[i] + " " + plural[i]);
			}
			else if (numBills[i] == 1){
				System.out.println(numBills[i] + " " + singular[i]);
			}
		}
	}
}
