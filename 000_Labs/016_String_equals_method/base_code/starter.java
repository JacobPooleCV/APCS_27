/*
 *	Author:  Justin Pyo
 *  Date: 10/2/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Scanner verity = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = verity.nextLine();
		if(role.equalsIgnoreCase("Wizard")) {
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		if(role.equalsIgnoreCase("Warrior")) {
			System.out.println("You've chosen the Warrior! For honor!");
		}
		if(role.equalsIgnoreCase("Rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
		}

	}
}
