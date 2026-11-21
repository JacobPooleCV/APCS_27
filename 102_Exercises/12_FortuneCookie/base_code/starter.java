/*
 *	Author: Justin Pyo
 *  Date: 9/22/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		System.out.println("Welcome to the Fortune Cookie Generator!");
		System.out.println("");

		int fortune = (int)(Math.random() * 10 + 1);
		if(fortune == 1) {
			System.out.println("You will find the part of the puzzle that you are missing- keep searching.");
		} else if (fortune == 2) {
			System.out.println("The peace will find you when you most need it.");
		} else if (fortune == 3) {
			System.out.println("The deeds you have given will return back to you.");
		} else if (fortune == 4) {
			System.out.println("Your deepest passions will continue to grow.");
		} else if (fortune == 5) {
			System.out.println("Don't put your head down, always be on the move.");
		} else if (fortune == 6) {
			System.out.println("The friend that may be the most closest may appear the most farthest.");
		} else if (fortune == 7) {
			System.out.println("Staying stuck in the past will not let you further into the future.");
		} else if (fortune == 8) {
			System.out.println("Stay strong.");
		} else if (fortune == 9) {
			System.out.println("Never ever give up.");
		} else if (fortune == 10) {
			System.out.println("You got this.");
		}

	}
}
