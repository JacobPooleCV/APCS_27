/*
 *	Author:  Justin Pyo
 *  Date: 9/10/26
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner cheese = new Scanner(System.in);
		Scanner pie = new Scanner(System.in);
		Scanner teletubby = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = cheese.nextLine();

		System.out.println("What is your age?");
		int age = pie.nextInt();

		System.out.println("What month were you born? (1-12)");
		int birthmonth = pie.nextInt();

		System.out.println("What day were you born? (1-31)");
		int birthday = pie.nextInt();

		System.out.println("What year were you born?");
		int birthyear = pie.nextInt();

		System.out.println("If I have a dollar and two quarters, how much money do I have? (0.0-#)");
		double buck = teletubby.nextDouble();

		System.out.println("Your name is " + name + " and you were born on " + birthmonth + "/" + birthday + "/" + birthyear + ".");
		System.out.println("You are " + age + " years old!!!");
		System.out.println("You have $" + buck + " in your wallet.");
	}
}
