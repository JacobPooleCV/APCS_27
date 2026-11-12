/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		int [] arr = new int[1001];
		int count = 0;
		while(count<1001){
			arr [count] = (count+1)*3;
			System.out.print(arr [count] + ", ");
			count++;
		}

		System.out.println("-------------------------------------------------------------------");

		int [] arr2 = new int[1001];
		int count2 = 0;
		while(count2<1001){
			arr [count2] = 1000-count2;
			System.out.print(arr [count2] + ", ");
			count2++;
		}
	
	}
}
