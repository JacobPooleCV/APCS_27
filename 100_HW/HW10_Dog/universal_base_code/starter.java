/*
 *	Author: Justin Pyo
 *  Date: 11-2-26
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		Dog max = new Dog("Max");
		max.setAge(12);
		Dog trevor =  new Dog("Trevor", "Chihuahua");

		System.out.println("Dog name?");
		String name = sc.nextLine();
		System.out.println("What age should " + name + " be?");
		int age = sc.nextInt();

				Dog player = new Dog(name, age);

		boolean playerIsSleeping = player.isSleeping();
		boolean trevorIsSleeping = trevor.isSleeping();

		System.out.println(player.getName() + " is a " + player.getBreed() + " that is " + player.getAge() + " years old!");

		System.out.println(trevor.getName() + " is a " + trevor.getBreed() + " that is " + trevor.getAge() + " years old!");

		if(playerIsSleeping == true){
			System.out.println(player.getName() + " is sleeping! Don't wake " + player.getName() + " up!");
		}
		else if(playerIsSleeping == false){
			System.out.println(player.getName() + " is awake!");
			player.bark();
		}

		if(trevorIsSleeping == true && playerIsSleeping == true){
			System.out.println(trevor.getName() + " is sleeping too!");
		}
		else if(trevorIsSleeping == false && playerIsSleeping == true){
			System.out.println(trevor.getName() + " isn't sleeping!");
		}
		else if(trevorIsSleeping == false && playerIsSleeping == false){
			System.out.println(trevor.getName() + " hears " + player.getName() +"!");
			trevor.bark();
		}
		else if(trevorIsSleeping == true && playerIsSleeping == false){
			System.out.println(trevor.getName() + " wakes up from hearing " + player.getName());
			trevor.bark();
		}

		



	}
}
