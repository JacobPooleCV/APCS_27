/*
 *	Author: Justin Pyo
 *  Date: 10/21/26
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee DwightS = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee JimH = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee PamB = new Employee(2011, "Pam", "Beesly", 2250);
		Employee RenB = new Employee(2010, "Ren", "Bolen", 676767.67);
		
		DwightS.raiseSalary(50);
		JimH.raiseSalary(50);
		PamB.raiseSalary(50);
		RenB.raiseSalary(50);


		System.out.println("");
		System.out.println(DwightS.getFirstName() + " " + DwightS.getLastName());
		System.out.println("------------------------------");
		System.out.println("Salary: " + DwightS.getSalary());
		System.out.println("Annual Salary: " + DwightS.getAnnualSalary());

		System.out.println("");
		System.out.println(JimH.getFirstName() + " " + JimH.getLastName());
		System.out.println("------------------------------");
		System.out.println("Salary: " + JimH.getSalary());
		System.out.println("Annual Salary: " + JimH.getAnnualSalary());
		
		System.out.println("");
		System.out.println(PamB.getFirstName() + " " + PamB.getLastName());
		System.out.println("------------------------------");
		System.out.println("Salary: " + PamB.getSalary());
		System.out.println("Annual Salary: " + PamB.getAnnualSalary());

		System.out.println("");
		System.out.println(RenB.getFirstName() + " " + RenB.getLastName());
		System.out.println("------------------------------");
		System.out.println("Salary: " + RenB.getSalary());
		System.out.println("Annual Salary: " + RenB.getAnnualSalary());




	}
}
