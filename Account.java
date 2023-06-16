package com.ualbany.finalProject;

//abstract class
public abstract class Account
{
	//variable
	private double total;
	
	//personal constructor
	public Account(double t)
	{
		this.total = t;
	}
	
	//calculates total balance between both accounts
	public double calculateTotal(double s, double c)
	{
		total = s + c;
		return total;
	}
	
	//returns the total variable
	public double getTotal()
	{
		return total;
	}
	
	//abstract method which SavingsAccount and CheckingAccount class adpot
	public abstract double getBalance();
}
