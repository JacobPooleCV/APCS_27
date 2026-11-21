/*
 *	Author:  Justin Pyo
 *  Date: 11-17-26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {

		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100 + 1);
			System.out.println(arr[i]);
        }
		
		System.out.println("Average: " + BaseClass.getArrayAverage(arr));
        System.out.println("Maximum: " + BaseClass.getArrayMax(arr));
        System.out.println("Minimum: " + BaseClass.getArrayMin(arr));

		
	}
}
