/*
 *	Author:  Justin Pyo
 *  Date: 11-13-26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {

		int[]arr1 = new int[1000];
		int count = 0;
		for(count = 0; count<1000; count++){
			arr1[count] = (int)(Math.random()*1000+1);
			System.out.println(arr1[count]);
		}


		
	}
}
