/*
 *	Author: Justin Pyo
 *  Date: 10/10/26
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println("");
		
		int picker = (int)(Math.random()*3+1);
		
		if(picker == 1) {
			System.out.println("It's a country in Europe!");
			System.out.print("What is your guess? ");
			String try1 = sc.nextLine();
		if(!try1.equalsIgnoreCase("france")) {
			System.out.println("");
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("'Oui, oui, oui. Merci.'");
			String try2 = sc.nextLine();
			if(!try2.equalsIgnoreCase("france")) {
				System.out.println("");
				System.out.println("The answer was France, better luck next time!");
			}
			else {
				System.out.println("");
				System.out.println("You got it! Woo!");
			}
		}
		else {
			System.out.println("");
			System.out.println("You got it! Woo!");
		}

		}
		else if(picker == 2) {
			System.out.println("It's a country in Africa!");
			System.out.print("What is your guess? ");
			String try1 = sc.nextLine();
		if(!try1.equalsIgnoreCase("Madagascar")) {
			System.out.println("");
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("'I like to move it, move it. I like to move it, move it. Ya like to?'");
			String try2 = sc.nextLine();
			if(!try2.equalsIgnoreCase("madagascar")) {
				System.out.println("");
				System.out.println("The answer was Madagascar, better luck next time!");
			}
			else {
				System.out.println("");
				System.out.println("You got it! Woo!");
			}
		}
		else {
			System.out.println("");
			System.out.println("You got it! Woo!");
		}
		}

		else if(picker == 3) {
			System.out.println("It's a country in Asia!");
			System.out.print("What is your guess? ");
			String try1 = sc.nextLine();
		if(!try1.equalsIgnoreCase("korea")) {
			System.out.println("");
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("'Oppa Gangnam style!'");
			String try2 = sc.nextLine();
			if(!try2.equalsIgnoreCase("korea")) {
				System.out.println("");
				System.out.println("The answer was Korea, better luck next time!");
			}
			else {
				System.out.println("");
				System.out.println("You got it! Woo!");
			}
		}
		else {
			System.out.println("");
			System.out.println("You got it! Woo!");
		}
		}
		}

}

