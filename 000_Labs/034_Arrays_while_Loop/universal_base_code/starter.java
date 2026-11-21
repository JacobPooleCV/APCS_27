/*
 *	Author:  Justin Pyo
 *  Date: 11-13-26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {

		int [] arr1 = new int[1000];
		int count = 0;
		while(count<1000){
			arr1[count] = (int)(Math.random()*2);
			System.out.println(arr1[count]);
			count++;
			
		}


		
	}
}
