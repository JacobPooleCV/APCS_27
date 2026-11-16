/*
 *	Author:Justin Pyo
 *  Date: 11-16-26
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String[] tvChars = {
			"Walter White", "Jesse Pinkman", "Saul Goodman", "Rick Grimes",
			"Eleven", "Michael Scott", "Dwight Schrute", "Jim Halpert",
			"Leslie Knope", "Ron Swanson", "Ted Lasso", "BoJack Horseman",
			"Homer Simpson", "Bart Simpson", "Peter Griffin", "Stewie Griffin",
			"Sheldon Cooper", "Geralt (Netflix)", "Wednesday Addams", "Joe Goldberg"
		};

		System.out.println("---------------------------------------------");
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars);
		System.out.println("---------------------------------------------");

		
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars, 5);
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		
	}

	public static void printArray(String[] arr){
		for(int count = 0; count < arr.length-1; count++){
			System.out.print(arr[count] + ", ");
		}
		System.out.println();
	}

	public static void leftShift(String [] arr){
		String savefirst = arr[0];
		for(int count = 0; count < arr.length-1; count++){
			arr[count] = arr[count+1];
			System.out.print(arr[count+1] + ", ");
		}
		System.out.println(savefirst);
		
	}

	public static void leftShift(String [] arr, int num){
		for(int count = 0; count < arr.length-num; count++){
			arr[count] = arr[count+num];
			System.out.print(arr[count] + ", ");
		}
		
	}	
}
