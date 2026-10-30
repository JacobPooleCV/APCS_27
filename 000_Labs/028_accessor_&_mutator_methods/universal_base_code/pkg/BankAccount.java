/*
 *	Author:  Justin Pyo
 *  Date: 10/28/26
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	public String Owner;
	public int AccountNum;
	private static int nextAccountNum = 500;
	public double Balance;
	public boolean IsActive = true;


	// -------CONSTRUCTORS-------
	public BankAccount(){
		Owner = "unknown";
		AccountNum = nextAccountNum;
		nextAccountNum++;
		Balance = 0; 
	}

	public BankAccount(String Own){
		Owner = Own;
		AccountNum = nextAccountNum;
		nextAccountNum++;
		Balance = 0;
	}

	public BankAccount(String Own, double Bal){
		Owner = Own;
		AccountNum = nextAccountNum;
		nextAccountNum++;
		Balance = Bal;
	}


	// -------METHODS-------
	
	public void setOwner(String Own){
		Owner = Own;
	}

	public String getOwner(){
		return Owner;
	}

	public void deposit(double deposit){
		if(IsActive = false){}
		Balance = Balance + deposit;
		System.out.println("Deposited $" + deposit);
	}

	public void withdraw(double withdraw){
		Balance = Balance - withdraw;
		if(Balance < 0){
			System.out.println("Insufficient funds!");
		}
		else
			System.out.println("Withdrew $" + withdraw);
			System.out.println("Current Account Balance: $" + Balance);

	}

	public double getBalance(){
		return Balance;
	}

	public void closeAccount(){
		System.out.println("Account closed for " + Owner);
	}

	public boolean checkBalance(){
		return IsActive;
	}

	public int getAccountNum(){
		return AccountNum;
	}

	public String getIsActive(){
		if(IsActive == false){
			return "Inactive";
		}
		else if(IsActive == true){
			return "Active";
		}
		else
			return "Inactive";
	}
	
	public void displayAccountInfo(){
		System.out.println();
		System.out.println("--- Account Info ---");
		System.out.println("Owner: " + getOwner());
		System.out.println("Account Number: " + getAccountNum());
		System.out.println("Balance: $" + getBalance());
		System.out.println("Status: " + getIsActive());
	}
	
	


}