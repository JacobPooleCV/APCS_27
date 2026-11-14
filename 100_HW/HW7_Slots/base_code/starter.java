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
		System.out.println("2. Input a wager less than or equal to your total amount of money. You cannot bet anything less than 1 dollar.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println("");


		String confirm = "ngl";



		while(money != 0) {
			int	verity = 0;
		while(verity == 0) {
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		confirm = sc.nextLine();

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





		System.out.print("You have $" + money + ". How much would you like to wager? ");
		int wager = sc.nextInt();
		sc.nextLine();

		while(wager > money || wager < 1) {
		if(wager > money) {
			System.out.print("You only have $" + money + "! Please enter a smaller number : ");
			wager = sc.nextInt();
			sc.nextLine();
		}
		else if(wager < 1) {
			System.out.println("Sneaky! No negatives or 0! : ");
			System.out.print("Please enter a bigger number : ");
			wager = sc.nextInt();
			sc.nextLine();
		}
		}
		
		System.out.println("");
		System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are:");
		System.out.println("");
		System.out.println("____________________");
		int slot1 = (int)(Math.random()*10+1);
		int slot2 = (int)(Math.random()*10+1);
		int slot3 = (int)(Math.random()*10+1);
		System.out.println(" | " + slot1 + " | " + slot2 + " | " + slot3 + " | ");
		System.out.println("____________________");

		if(slot1 == slot2 && slot1 == slot3) {
			money = money + wager * 2;
			System.out.println("JACKPOT! You're wager has now been tripled!");
			System.out.println("You now have $" + money + ".");
		}
		else if(slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {
						money = money + wager;
			System.out.println("You won! You're wager has now been doubled!");
			System.out.println("You now have $" + money + ".");
		}
		else {
			money = money - wager;
			System.out.println("Didn't win this time, better luck next time!");
			System.out.println("You now have $" + money + ".");
		}

		System.out.println("");

		System.out.println("----------------------------------------------");
		System.out.println("");

		}

		System.out.println("You've run out of money! Thanks for coming! Come back soon!");

	}
}
