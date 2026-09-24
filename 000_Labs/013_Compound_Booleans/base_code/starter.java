/*
 *	Author:  Justin Pyo
 *  Date: 9/24/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner numbers = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int int1 = numbers.nextInt();
		System.out.print("Please enter your second number: ");
		int int2 = numbers.nextInt();
		System.out.print("Please enter your third number: ");
		int int3 = numbers.nextInt();
		if((int1 > int2) && (int1 > int3)) {
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was " + int1 + ".");
		}
		if((int2 > int1) && (int2 > int3)) {
			System.out.println("Your second nmber is the largest of the three!");
			System.out.println("The number was " + int2 + ".");

		}
		if((int3 > int1) && (int3 > int2)) {
			System.out.println("Your third number is the largest of the three!");
			System.out.println("The number was " + int3 + ".");
		}
			if((int1 < int2) && (int1 < int3)) {
				System.out.println("Your first number is the smallest of the three!");
				System.out.println("The number was " + int1 + ".");
			}
			if((int2 < int1) && (int2 < int3)) {
				System.out.println("Your second nmber is the smallest of the three!");
				System.out.println("The number was " + int2 + ".");
			}
			if((int3 < int1) && (int3 < int2)) {
				System.out.println("Your third number is the smallest of the three!");
				System.out.println("The number was " + int3 + ".");
			}
	}
}
