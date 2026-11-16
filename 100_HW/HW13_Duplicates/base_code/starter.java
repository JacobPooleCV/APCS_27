/*
 *	Author: Justin Pyo
 *  Date: 11/15/26
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {

		int [] arr = new int[20];
		String dash = "---------------------------------------------";
		System.out.println(dash);
		System.out.println("These are the 20 numbers");
		int counter = 0;
		while(counter < arr.length){
			arr[counter] = (int)(Math.random()*10+1);
			System.out.print(arr[counter] + " ");
			counter++;
		}
		System.out.println();
		System.out.println(dash);
		int random = (int)(Math.random()*10+1);
		System.out.println("The random number to look for is " + random);
		counter = 0;
		while(counter < arr.length){
			if(arr[counter] == random){
				System.out.println("Duplicate found at index " + counter);
			}
			counter++;
		}
		System.out.println(dash);
		System.out.println("Looking for two in a row:");
		counter = 0;
		while(counter < arr.length-1){
			if(arr[counter] == arr[counter+1]){
				System.out.println("Two in a row found at indexes " + counter + " and " + (counter+1) + ". The number is " + arr[counter]);
			}
			counter++;
		}

	}
}
