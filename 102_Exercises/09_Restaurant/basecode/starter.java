/*
 *	Author:  Justin Pyo
 *  Date: 9/14/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {



		Scanner Restaurant = new Scanner(System.in);
		Scanner ItemNumbers = new Scanner(System.in);
		Scanner ItemAmmount = new Scanner(System.in);

		String equals = "=================================================";
		String hyphen = "-------------------------------------------------";

		System.out.println(equals);
		System.out.println("            WELCOME RESTAURANT OWNER!            ");
		System.out.println(equals);
		System.out.println();

		System.out.print("What's the name of your restaurant? ");
		String Rname = Restaurant.nextLine();
		System.out.println();

		System.out.print("What's your name? ");
		String Yname = Restaurant.nextLine();
		System.out.println();

		System.out.println("Great to see you, " + Yname + "! Let's set up a menu for " + Rname + "!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println();

		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String NameI1 = Restaurant.nextLine();
		System.out.print("Price of " + NameI1 + " ($): ");
		double PriceI1 = ItemNumbers.nextDouble();
		System.out.print("How many " + NameI1 + " would you like? ");
		int AmmountI1 = ItemAmmount.nextInt();
		System.out.println("Added " + AmmountI1 + "x " + NameI1 + " to your order! " + "($" + (((double)AmmountI1)*PriceI1) + ")");

		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String NameI2 = Restaurant.nextLine();
		System.out.print("Price of " + NameI2 + " ($): ");
		double PriceI2 = ItemNumbers.nextDouble();
		System.out.print("How many " + NameI2 + " would you like? ");
		int AmmountI2 = ItemAmmount.nextInt();
		System.out.println("Added " + AmmountI2 + "x " + NameI2 + " to your order! " + "($" + (((double)AmmountI2)*PriceI2) + ")");

		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String NameI3 = Restaurant.nextLine();
		System.out.print("Price of " + NameI3 + " ($): ");
		double PriceI3 = ItemNumbers.nextDouble();
		System.out.print("How many " + NameI3 + " would you like? ");
		int AmmountI3 = ItemAmmount.nextInt();
		System.out.println("Added " + AmmountI3 + "x " + NameI3 + " to your order! " + "($" + (((double)AmmountI3)*PriceI3) + ")");

		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		double TIP = ItemNumbers.nextDouble();

		System.out.println("");
	
			System.out.println(equals);
			System.out.println("          " + Rname + " - Menu For Today");
			System.out.println(equals);
			System.out.println("Owner: " + Yname);
			System.out.println(hyphen);
			System.out.println("Item                    Qty     Price");
			System.out.println(hyphen);
			System.out.println(NameI1 + "                     " + AmmountI1 + "      " + (AmmountI1 * PriceI1));
			System.out.println(NameI2 + "                     " + AmmountI2 + "      " + (AmmountI2 * PriceI2));
			System.out.println(NameI3 + "                     " + AmmountI3 + "      " + (AmmountI3 * PriceI3));
			System.out.println(hyphen);
			double SUBTOTAL = ((AmmountI1 * PriceI1) + (AmmountI2 * PriceI2) + (AmmountI3 * PriceI3));
			System.out.println("Subtotal:                " + SUBTOTAL);
			System.out.println("Tax (9.75%):             " + ((9.75/100) * SUBTOTAL));
			System.out.println("Tip:                     " + TIP);
			System.out.println("Tip Amount:              " + (SUBTOTAL * TIP));
			System.out.println(equals);
			System.out.println("TOTAL:                  $" + (SUBTOTAL + (SUBTOTAL * TIP) + ((9.75/100) * SUBTOTAL)));
			System.out.println(equals);
			System.out.println("");
			System.out.println("Thanks for eating at " + Rname + "!");
			System.out.println("Come back soon -- we'll always have a byte for you!");
	}
}
