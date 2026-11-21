package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	public String actor;		// What's the actors name?
	public int age;			// What's the age of the actor?
	public String villain;		// Who's the arch nemesis of this Spiderman?

	public Spiderman(){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}

	public Spiderman(String act){
		actor = act;
		age = 0;
		villain = "unknown";
	}

	public Spiderman(int years){
		actor = "unknown";
		age = years;
		villain = "unknown";
	}

	public Spiderman(String act, int years){
		actor = act;
		age = years;
		villain = "unknown";
	}

	public Spiderman(String act, int years, String vil){
		actor = act;
		age = years;
		villain = vil;
	}

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge


	public String getActor(){
		return actor;
	}

	public int getAge(){
		return age;
	}

	public String getVillian(){
		return villain;
	}

	public void setActor(String act){
		actor = act;
	}

	public void setAge(int years){
		age = years;
	}

	public void setVillian(String vil){
		villain = vil;
	}	

	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
