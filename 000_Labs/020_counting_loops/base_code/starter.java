/*
 *	Author: Justin Pyo
 *  Date: 10/9/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Scanner sc = new Scanner(System.in);
		int put = 0;
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.println("");
		System.out.print("Please enter how many times you'd like to print your name: ");
		int times = sc.nextInt();
		while(put < times) {
			System.out.println(name);
			put++;
		}

		
	}
}
