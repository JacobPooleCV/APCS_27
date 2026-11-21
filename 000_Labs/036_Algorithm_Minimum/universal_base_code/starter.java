	/*
	*	Author:  Justin Pyo
	*  Date: 11/13/26
	*/

	import pkg.*;
	import java.util.Scanner;
	import java.util.Random;


	class starter {
		public static void main(String args[]) {

			int avg = 0;

			int[]verity = new int[(int)(Math.random()*150+51)];
			int count = 0;
			for(count = 0; count<(verity.length); count++){
				verity[count] = (int)(Math.random()*100+1);
				System.out.println(verity[count]);
				avg = avg + verity[count];
			}

			int min = verity[0];
			int countmin = 0;
			while(countmin<verity.length){
				if(verity[countmin] < min){
					min = verity[countmin];
				}
					countmin++;
			}
			System.out.println();
			System.out.println("Minimum: " + min);
			
			int max = verity[0];
			int countmax = 0;
			while(countmax<verity.length){
				if(verity[countmax] > max){
					max = verity[countmax];
				}
					countmax++;
			}
			System.out.println();
			System.out.println("Maximum: " + max);
			
			System.out.println();
			System.out.println("Average: " + (avg/verity.length));
			
			
			
			
		}
	}
