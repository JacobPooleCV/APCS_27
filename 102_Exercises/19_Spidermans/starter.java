/*
	Author: Justin Pyo
	Date: 10/26/26
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {

		Spiderman a = new Spiderman("Tobey Maguire");
		Spiderman b = new Spiderman(40);
		Spiderman c = new Spiderman("Tom", 26);
		Spiderman d = new Spiderman("Verity", 99, "Cruelty");
		
		a.setAge(48);
		a.setVillian("Green Goblin");

		b.setActor("Andrew Garfield");
		b.setVillian("Electro");

		c.setVillian("The Vulture");
		
		System.out.println("Actor: " + a.getActor());
		System.out.println("Actor's age: " + a.getAge());
		System.out.println("Villian: " + a.getVillian());
		System.out.println();

		System.out.println("Actor: " + b.getActor());
		System.out.println("Actor's age: " + b.getAge());
		System.out.println("Villian: " + b.getVillian());
		System.out.println();

		System.out.println("Actor: " + c.getActor());
		System.out.println("Actor's age: " + c.getAge());
		System.out.println("Villian: " + c.getVillian());
		System.out.println();

		System.out.println("Actor: " + d.getActor());
		System.out.println("Actor's age: " + d.getAge());
		System.out.println("Villian: " + d.getVillian());
		System.out.println();

	}	
}
