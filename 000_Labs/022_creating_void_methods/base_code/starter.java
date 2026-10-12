/*
 *	Author:  Justin Pyo
 *  Date: 10-12-26
*/

import java.util.Scanner;

class starter {

	public static String add(String a, String b){
		String sum = a + " " + b;
		return sum;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String a = sc.nextLine();
		System.out.println("Write a sentence!");
		String b = sc.nextLine();
		System.out.println("");
		System.out.println("This is using the methods!");
		System.out.println(a);
		System.out.println(add(a,b));
	

	}
}
