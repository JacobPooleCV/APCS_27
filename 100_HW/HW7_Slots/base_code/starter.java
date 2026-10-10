/*
 *	Author: Justin Pyo
 *  Date: 10/6/26
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int money = 100;

		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println("");

		int verity = 0;

		while(verity == 0) {
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		String confirm = sc.nextLine();
		verity = 0;
		if(confirm.equalsIgnoreCase("yes") || confirm.equalsIgnoreCase("y")) {
			verity = 1;
		}
		else if(confirm.equalsIgnoreCase("no") || confirm.equalsIgnoreCase("n")) {
		System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
		return;
		} 
		else {
		System.out.println("That wasn't quite the correct answer. Try again.");
		System.out.println("--------------------------------------------------");
		System.out.println("");
		}
		}

		while(money != 0) {

		System.out.print("You have $" + money + ". How much would you like to wager? ");
		int wager = sc.nextInt();

		while(wager > money || wager < 1) {
		if(wager > money) {
			System.out.print("You only have $" + money + "! Please enter a smaller number : ");
			wager = sc.nextInt();
		}
		else if(wager < 1) {
			System.out.println("Sneaky! No negatives or 0! : ");
			System.out.print("Please enter a bigger number : ");
			wager = sc.nextInt();
		}
		}
		
		System.out.println("");
		System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are:");


		}

	}
}
