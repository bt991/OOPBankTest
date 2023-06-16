package com.ualbany.finalProject;

public class CheckingAccount extends Account
{
	//instance variable for Checking Account balance
	private double checkBalance;
	
	//constructors, super(t) from inheriting abstract class Account
	public CheckingAccount(double t, double c)
	{
		super(t);
		this.checkBalance = c;
	}
	
	//performs a credit against the checkBalance variable
	public void credit(double amount) 
	{
		checkBalance += amount;
	}

	//performs a debit against the checkBalance variable
	public void debit(double amount)
	{
		checkBalance -= amount;
	}

	//abstract method inherited from abstract class Account
	public double getBalance()
	{
		return checkBalance;
	}
	
	//returns the following string along with updated checkBalance variable
	public String toString()
	{
		return "Checking account balance: " + checkBalance;
	}

}
