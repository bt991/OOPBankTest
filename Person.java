package com.ualbany.finalProject;

public class Person
{
	//instance variables
	private String firstName;
	private String lastName;
	private Address address;
	private Account account;
	
	//constructors
	public Person(String f, String l, Address a, Account acc)
	{
		this.firstName = f;
		this.lastName = l;
		this.address = a;
		this.account = acc;
	}
	
	//sets first name of customer
	public void setFirstName(String f)
	{
		this.firstName = f;
	}
	
	//sets last name of customer
	public void setLastName(String l)
	{
		this.lastName = l;
	}
	
	//creates address object and sets it
	public void setAddress(Address a)
	{
		this.address = a;
	}
	
	//creates account object and sets it
	public void setAccount(Account acc)
	{
		this.account = acc;
	}
	
	//returns first name of customer
	public String getFirstName()
	{
		return firstName;
	}
	
	//returns last name of customer
	public String getLastName()
	{
		return lastName;
	}
	
	//gets address of customer
	public Address getAddress()
	{
		return address;
	}
	
	//gets account information for customer
	public Account getAccount()
	{
		return account;
	}
	
	//returns the following string with updated variables
	public String toString()
	{
		return "\nCustomer's name: " + lastName + ", " + firstName + ".\nAddress: " + address + "\n\nAccount information:\n";
	}
}
