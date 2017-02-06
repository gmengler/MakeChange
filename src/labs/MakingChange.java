package labs;

import java.util.Scanner;

public class MakingChange {
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

		double twenty;
		double printTwenty;
		double ten;
		double printTen;
		double five;
		double printFive;
		double one;
		double printOne;
		double quarter;
		double printQuarter;
		double dime;
		double printDime;
		double nickel;
		double printNickel;
		double printCent;

		if (remain >= 20) {
			twenty = remain % 20;
			printTwenty = remain / 20;
			int a = (int) printTwenty;
			ten = twenty % 10;
			printTen = twenty / 10;
			int b = (int) printTen;
			five = ten % 5;
			printFive = ten / 5;
			int c = (int) printFive;
			one = five % 1;
			printOne = five / 1;
			int d = (int) printOne;
			quarter = one % 0.25;
			printQuarter = one / 0.25;
			int e = (int) printQuarter;
			dime = quarter % 0.10;
			printDime = quarter / 0.10;
			int f = (int) printDime;
			nickel = dime % 0.05;
			printNickel = dime / 0.05;
			int g = (int) printNickel;
			printCent = (int) Math.round(nickel / 0.01);
			int h = (int) printCent;

			if (a > 1) {
				System.out.println(a + " twenty dollar bills.");
			}
			if (a == 1) {
				System.out.println(a + " twenty dollar bill.");
			}
			if (b > 1) {
				System.out.println(b + " ten dollar bills.");
			}
			if (b == 1) {
				System.out.println(b + " ten dollar bill.");
			}
			if (c > 1) {
				System.out.println(c + " five dollar bills.");
			}
			if (c == 1) {
				System.out.println(c + " five dollar bill.");
			}
			if (d > 1) {
				System.out.println(d + " one dollar bills.");
			}
			if (d == 1) {
				System.out.println(d + " one dollar bill.");
			}
			if (e > 1) {
				System.out.println(e + " quarters.");
			}
			if (e == 1) {
				System.out.println(e + " quarter.");
			}
			if (f > 1) {
				System.out.println(f + " dimes.");
			}
			if (f == 1) {
				System.out.println(f + " dime.");
			}
			if (g > 1) {
				System.out.println(g + " nickels.");
			}
			if (g == 1) {
				System.out.println(g + " nickel.");
			}
			if (h > 1) {
				System.out.println(h + " pennies.");
			}
			if (h == 1) {
				System.out.println(h + " penny.");
			}

		} else if (remain < 20 && remain >= 10) {
			ten = remain % 10;
			printTen = remain / 10;
			int b = (int) printTen;
			five = ten % 5;
			printFive = ten / 5;
			int c = (int) printFive;
			one = five % 1;
			printOne = five / 1;
			int d = (int) printOne;
			quarter = one % 0.25;
			printQuarter = one / 0.25;
			int e = (int) printQuarter;
			dime = quarter % 0.10;
			printDime = quarter / 0.10;
			int f = (int) printDime;
			nickel = dime % 0.05;
			printNickel = dime / 0.05;
			int g = (int) printNickel;
			printCent = (int) Math.round(nickel / 0.01);
			int h = (int) printCent;
			if (b > 1) {
				System.out.println(b + " ten dollar bills.");
			}
			if (b == 1) {
				System.out.println(b + " ten dollar bill.");
			}
			if (c > 1) {
				System.out.println(c + " five dollar bills.");
			}
			if (c == 1) {
				System.out.println(c + " five dollar bill.");
			}
			if (d > 1) {
				System.out.println(d + " one dollar bills.");
			}
			if (d == 1) {
				System.out.println(d + " one dollar bill.");
			}
			if (e > 1) {
				System.out.println(e + " quarters.");
			}
			if (e == 1) {
				System.out.println(e + " quarter.");
			}
			if (f > 1) {
				System.out.println(f + " dimes.");
			}
			if (f == 1) {
				System.out.println(f + " dime.");
			}
			if (g > 1) {
				System.out.println(g + " nickels.");
			}
			if (g == 1) {
				System.out.println(g + " nickel.");
			}
			if (h > 1) {
				System.out.println(h + " pennies.");
			}
			if (h == 1) {
				System.out.println(h + " penny.");
			}
		} else if (remain < 10 && remain >= 5) {
			five = remain % 5;
			printFive = remain / 5;
			int c = (int) printFive;
			one = five % 1;
			printOne = five / 1;
			int d = (int) printOne;
			quarter = one % 0.25;
			printQuarter = one / 0.25;
			int e = (int) printQuarter;
			dime = quarter % 0.10;
			printDime = quarter / 0.10;
			int f = (int) printDime;
			nickel = dime % 0.05;
			printNickel = dime / 0.05;
			int g = (int) printNickel;
			printCent = (int) Math.round(nickel / 0.01);
			int h = (int) printCent;
			if (c > 1) {
				System.out.println(c + " five dollar bills.");
			}
			if (c == 1) {
				System.out.println(c + " five dollar bill.");
			}
			if (d > 1) {
				System.out.println(d + " one dollar bills.");
			}
			if (d == 1) {
				System.out.println(d + " one dollar bill.");
			}
			if (e > 1) {
				System.out.println(e + " quarters.");
			}
			if (e == 1) {
				System.out.println(e + " quarter.");
			}
			if (f > 1) {
				System.out.println(f + " dimes.");
			}
			if (f == 1) {
				System.out.println(f + "dime.");
			}
			if (g > 1) {
				System.out.println(g + " nickels.");
			}
			if (g == 1) {
				System.out.println(g + " nickel.");
			}
			if (h > 1) {
				System.out.println(h + " pennies.");
			}
			if (h == 1) {
				System.out.println(h + " penny.");
			}
		} else if (remain < 5 && remain >= 1) {
			one = remain % 1;
			printOne = remain / 1;
			int d = (int) printOne;
			quarter = one % 0.25;
			printQuarter = one / 0.25;
			int e = (int) printQuarter;
			dime = quarter % 0.10;
			printDime = quarter / 0.10;
			int f = (int) printDime;
			nickel = dime % 0.05;
			printNickel = dime / 0.05;
			int g = (int) printNickel;
			printCent = (int) Math.round(nickel / 0.01);
			int h = (int) printCent;
			if (d > 1) {
				System.out.println(d + " one dollar bills.");
			}
			if (d == 1) {
				System.out.println(d + " one dollar bill.");
			}
			if (e > 1) {
				System.out.println(e + " quarters.");
			}
			if (e == 1) {
				System.out.println(e + " quarter.");
			}
			if (f > 1) {
				System.out.println(f + " dimes.");
			}
			if (f == 1) {
				System.out.println(f + " dime.");
			}
			if (g > 1) {
				System.out.println(g + " nickels.");
			}
			if (g == 1) {
				System.out.println(g + " nickel.");
			}
			if (h > 1) {
				System.out.println(h + " pennies.");
			}
			if (h == 1) {
				System.out.println(h + " penny.");
			}
		} else if (remain < 1 && remain >= 0.25) {
			quarter = remain % 0.25;
			printQuarter = remain / 0.25;
			int e = (int) printQuarter;
			dime = quarter % 0.10;
			printDime = quarter / 0.10;
			int f = (int) printDime;
			nickel = dime % 0.05;
			printNickel = dime / 0.05;
			int g = (int) printNickel;
			printCent = (int) Math.round(nickel / 0.01);
			int h = (int) printCent;
			if (e > 1) {
				System.out.println(e + " quarters.");
			}
			if (e == 1) {
				System.out.println(e + " quarter.");
			}
			if (f > 1) {
				System.out.println(f + " dimes.");
			}
			if (f == 1) {
				System.out.println(f + " dime.");
			}
			if (g > 1) {
				System.out.println(g + " nickels.");
			}
			if (g == 1) {
				System.out.println(g + " nickel.");
			}
			if (h > 1) {
				System.out.println(h + " pennies.");
			}
			if (h == 1) {
				System.out.println(h + " penny.");
			}
		} else if (remain < 0.25 && remain >= 0.10) {
			dime = remain % 0.10;
			printDime = remain / 0.10;
			int f = (int) printDime;
			nickel = dime % 0.05;
			printNickel = dime / 0.05;
			int g = (int) printNickel;
			printCent = (int) Math.round(nickel / 0.01);
			int h = (int) printCent;
			if (f > 1) {
				System.out.println(f + " dimes.");
			}
			if (f == 1) {
				System.out.println(f + " dime.");
			}
			if (g > 1) {
				System.out.println(g + " nickels.");
			}
			if (g == 1) {
				System.out.println(g + " nickel.");
			}
			if (h > 1) {
				System.out.println(h + " pennies.");
			}
			if (h == 1) {
				System.out.println(h + " penny.");
			}
		} else if (remain < 0.10 && remain >= 0.05) {
			nickel = remain % 0.05;
			printNickel = remain / 0.05;
			int g = (int) printNickel;
			printCent = (int) Math.round(nickel / 0.01);
			int h = (int) printCent;
			if (g > 1) {
				System.out.println(g + " nickels.");
			}
			if (g == 1) {
				System.out.println(g + " nickel.");
			}
			if (h > 1) {
				System.out.println(h + " pennies.");
			}
			if (h == 1) {
				System.out.println(h + " penny.");
			}
		} else if (remain < 0.05 && remain >= 0.01) {
			printCent = (int) Math.round(remain / 0.01);
			int h = (int) printCent;
			if (h > 1) {
				System.out.println(h + " pennies.");
			}
			if (h == 1) {
				System.out.println(h + " penny.");
			}
		}
	}
}
