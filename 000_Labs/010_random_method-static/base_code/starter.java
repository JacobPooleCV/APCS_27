/*
 *	Author:  Justin Pyo
 *  Date: 9/16/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// a.
			int i1 = (int)(Math.random() * 10);
			System.out.println("A number between 0 - 9: " + i1);
		// b.
			int i2 = (int)(Math.random() * 10 + 1);
			System.out.println("A number between 1-10: " + i2);
		// c.
			double d1 = (double)(Math.random() * 1 + 2.5);
			System.out.println("A number between 2.5 and 3.5: " + d1);
		// d. 
			double d2 = (double)(Math.random() * 575 + 14);
			System.out.println("A number between 14 and 589: " + d2);

	}
}
