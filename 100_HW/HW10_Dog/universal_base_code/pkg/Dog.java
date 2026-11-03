 	package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	private String name;
	private int age;
	private String breed;

	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}

	public Dog(String a) {
		name = a;
		age = 1;
		breed = "dog dog";
	}

	public Dog(String a, String c) {
		name = a;
		age = 1;
		breed = c;
	}

	public Dog(String a, int b) {
		name = a;
		age = b;
		breed = "dog dog";
	}

	//methods

	public void setName(String a) {
		name = a;
	}

	public void setAge(int b) {
		age = b;
	}

	public void setBreed(String c) {
		breed = c;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getBreed() {
		return breed;
	}

	public boolean isSleeping() {
		int sleeping = (int)(Math.random()*2+1);
		if(sleeping == 1){
			return true;
		}
		else{
			return false;
		}
	}

	public void bark() {
		System.out.println(name + " Barks");
	}


}
