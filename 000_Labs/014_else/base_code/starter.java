/*
 *	Author:  Justin Pyo
 *  Date: 9/25/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Scanner verity = new Scanner(System.in);
		int randomity = (int)(Math.random() * 1000 + 1);
		System.out.print("Pick a number between 1 - 1000: ");
		int lovity = verity.nextInt();
		if(randomity == lovity){
			System.out.println("You guessed the correct number! Congrats!");
		}
		else{
			System.out.println("Your number wasn't the random number. The number was " + randomity);
		}
	}
}
