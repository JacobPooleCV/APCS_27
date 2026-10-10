/*
 *	Author:  Justin Pyo
 *  Date: 10/9/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the guessing game!");
		int random = (int)(Math.random()*1000+1);
		int guess = 0;

		while(guess != random) {
			System.out.print("Please guess a number: ");
			guess = sc.nextInt();

			if(guess < random) {
				System.out.println("The number is higher.");
			}
			else if (guess>random) {
				System.out.println("The number is lower.");
			}
		}
		System.out.println("You got the number!");

		
	}
}
