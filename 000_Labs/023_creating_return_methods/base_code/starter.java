/*
 *	Author:  Justin Pyo
 *  Date: 10/16/26
*/

import java.util.Scanner;

class starter {
	public static int pow(int x, int y){
		int product = x;
		int count = 0;
		while(count < y-1){
			product = product * x;
			count = count+1;
		}
		return product;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int x = sc.nextInt();
		System.out.println("What is your exponent number? (Nothing under 1)");
		int y = sc.nextInt();
		System.out.print("Your answer is: ");
		System.out.println(pow(x,y));
		
	}
}
