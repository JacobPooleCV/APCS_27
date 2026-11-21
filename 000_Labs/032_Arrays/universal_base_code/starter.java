/*
 *	Author:  Justin Pyo
 *  Date: 11/12/2026
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {

		BaseClass test = new BaseClass();

		int [] arr1 = new int[10];
		int count = 0;
		while(count<10){
		arr1[count] = 9-count;
		System.out.println(arr1[count]);
		count++;
		}
		
	}
}
