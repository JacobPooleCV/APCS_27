/*
 *	Author: Justin Pyo 
 *  Date: 10/2/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner verity = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = verity.nextLine();
			System.out.println("What is your title? Ex: Slayer of Dragons");
			String title = verity.nextLine();
			System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
			String role = verity.nextLine();

				if(role.equalsIgnoreCase("Wizard")){
					System.out.println("You've chosen the Wizard! Excelsior!");
					role = "Wizard";
				}
				else if(role.equalsIgnoreCase("Warrior")){
					System.out.println("You've chosen the Warrior! For honor!");
					role = "Warrior";
				}
				else if(role.equalsIgnoreCase("Rogue")){
					System.out.println("You've chosen the Rogue! How cunning!");
					role = "Rogue";
				}
				else {
					System.out.println("You've decided not to choose a roll. Rerunning program.");
				}

				int spleft = 20;

				System.out.println("");
				System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
				System.out.println("");
				System.out.print("Strength (1-10): ");
				int strength = verity.nextInt();

					if((strength > 10) || (strength < 1) || (strength > spleft)) {
						System.out.print("Please input a value that is within the range. ");
						System.out.print("Strength (1-10): ");
						strength = verity.nextInt();
					}
					if((strength <= 10) && (strength > 1) && (strength <= spleft)) {
						spleft = spleft - strength;
						System.out.println("You have " + spleft + " left to spend.");
					}
					else {
						System.exit(0);
					}

					System.out.println("");
					System.out.print("Dexterity (1-10): ");
					int dexterity = verity.nextInt();

					if((dexterity > 10) || (dexterity < 1) || (dexterity >= spleft)) {
						System.out.print("Please input a value that is within the range. ");
						System.out.print("Dexterity (1-10): ");
						dexterity = verity.nextInt();
					}
					if((dexterity <= 10) && (dexterity > 1) && (dexterity < spleft)) {
						spleft = spleft - dexterity;
						System.out.println("You have " + spleft + " left to spend.");
					}
					
					System.out.println("");
					System.out.print("Intelligence (1-10): ");
					int intelligence = verity.nextInt();
					
					if((intelligence > 10) || (intelligence < 1) || (intelligence > spleft)) {
						System.out.print("Please input a value that is within the range. ");
						System.out.print("Charisma (1-10): ");
						intelligence = verity.nextInt();
					}
					if((intelligence <= 10) && (intelligence > 1) && (intelligence <= spleft)) {
						spleft = spleft - intelligence;
						System.out.println("You have " + spleft + " left to spend.");
					}
					
					System.out.println("");
					System.out.print("Charisma (1-10): ");
					int charisma = verity.nextInt();

					if((charisma > 10) || (charisma < 1) || (charisma > spleft)) {
						System.out.print("Please input a value that is within the range. ");
						System.out.print("Charisma (1-10): ");
						charisma = verity.nextInt();
					}
					if((charisma <= 10) && (charisma > 1) && (charisma <= spleft)) {
						spleft = spleft - charisma;
					}

					System.out.println("");
					System.out.println("You have " + spleft + " to spend for next time.");

					System.out.println("--------------------------------------------");
					System.out.println("You are " + name + ", the " + title + " of CVHS.");
					System.out.println("You're a " + role + " with the following stats!");
					System.out.println("Strength - " + strength);
					System.out.println("Dexterity - " + dexterity);
					System.out.println("Intelligence - " + intelligence);
					System.out.println("Charisma - " + charisma);
					System.out.println("");
					System.out.println("Good luck on your quest " + name + "!");

				
		
	}
}






	
