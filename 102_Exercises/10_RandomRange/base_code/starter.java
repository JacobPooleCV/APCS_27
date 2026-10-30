/*
 *	Author:Justin Pyo
 *  Date: 9/ 17/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner range = new Scanner(System.in);
	System.out.println("Enter 2 numbers to create a range for your random number");
	System.out.print("Please enter an integer: ");
	int r1 = range.nextInt();
	System.out.print("Please enter another integer (bigger than the first): ");
	int r2 = range.nextInt();
	System.out.println("");
	System.out.println("Your range is " + r1 + " to " + r2 + ".");
	System.out.println("Here are 5 numbers generated in that range.");
	String seperator = ", ";
	int generator = (int)(Math.random() * (r2 - r1) + (r1));
	System.out.print(generator + seperator);
	generator = (int)(Math.random() * (r2 - r1) + (r1));
	System.out.print(generator + seperator);
	generator = (int)(Math.random() * (r2 - r1) + (r1));
	System.out.print(generator + seperator);
	generator = (int)(Math.random() * (r2 - r1) + (r1));
	System.out.print(generator + seperator);
	generator = (int)(Math.random() * (r2 - r1) + (r1));
	System.out.println(generator);
	
	



	}
}
