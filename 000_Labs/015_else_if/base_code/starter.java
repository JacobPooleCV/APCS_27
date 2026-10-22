/*
 *	Author:  Justin Pyo
 *  Date: 9/28/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Scanner elsity = new Scanner(System.in);
		int randomity = (int)(Math.random()*1000+1);
		System.out.print("Pick a number between 1 - 1000: ");
		int guessity = elsity.nextInt();
		if(guessity == randomity) { 
			System.out.println("You guessed the number correctly! Congrats");
		}

		else if(guessity < randomity) {
		
			System.out.println("Your number was smaller than the number. The number was " + randomity + ".");

		}

		else {
			System.out.println("Your number was bigger than the number. The number was " + randomity + ".");
		}
	

	}
}
