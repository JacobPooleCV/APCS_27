/*
 *	Author:  Justin Pyo
 *  Date: 11/19/26
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public static void toStringArray(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]); 
		}
	}

	public static int getArrayAverage(int[] a){
		int total = 0;
		for(int i = 0; i < a.length; i++){
			total += a[i];
		}
		return total/a.length;
	}

	public static int getArrayMax(int[] a){
		int max = a[0];
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		return max;
	}

	public static int getArrayMin(int[] a){
		int min = a[0];
		for(int i = 0; i < a.length; i++){
			if(a[i] < min){
				min = a[i];
			}
		}
		return min;
	}


}

