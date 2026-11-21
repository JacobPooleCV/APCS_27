/*
 *	Author:  Justin Pyo
 *  Date: 11-19-26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("What is your favorite food?");
        String food = scan.nextLine();

        System.out.println("\nAre you sure about that?");
        System.out.println("You said \"" + food + "\"");
        System.out.println("\tIt's ok to have wrong opinions.");
        System.out.println("You don't have to lie \\ just be honest.");

        scan.close();


		
	}
}
