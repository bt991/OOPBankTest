package com.ualbany.finalProject;

public class SavingsAccount extends Account
{
	//instance variable
	private double savBalance;
	
	//constructors, super(t) inherited from abstract class Account
	public SavingsAccount(double t, double s)
	{
		super(t);
		this.savBalance = s;
	}
	
	//performs a credit on savBalance
	public void credit(double amount) 
	{
		savBalance += amount;
	}

	//performs a debit on savBalance
	public void debit(double amount)
	{
		savBalance -= amount;
	}

	//abstract method inherited from abstract class Account
	public double getBalance()
	{
		return savBalance;
	}
	
	//returns the following string
	public String toString()
	{
		return "Savings account balance: " + savBalance;
	}
}
