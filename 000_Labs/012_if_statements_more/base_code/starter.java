/*
 *	Author:  Justin Pyo
 *  Date: 9/24/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner numbers = new Scanner(System.in);
		System.out.print("Please input your first number: ");
		int int1 = numbers.nextInt();
		System.out.println("");
		System.out.print("Please input your second number: ");
		int int2 = numbers.nextInt();
			if(int1 != int2) {
				System.out.println("Your numbers are different!");
			}
			if(int1 == int2) {
				System.out.println("Your numbers are the same!");
			}
			

	}
}
