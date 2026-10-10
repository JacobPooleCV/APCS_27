/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		int var1 = (int)(Math.random()*10+10);
		int var2 = (int)(Math.random()*10+10);
		System.out.println("the first variable is: " + var1);
		System.out.println("the second variable is: " + var2);
		boolean different = var1 != var2;
		if(different){
			System.out.println("The variables are different");
		}
		boolean same = var1 == var2;
		if(same){
			System.out.println("The variables are the same");
		}
}
}