package com.ualbany.finalProject;

public class Address
{
	//defining variables for the class
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zip;

	//Constructors
	public Address(String line1, String line2, String city, String state, String zip) 
	{
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	//set line 1
	public void setLine1(String line1)
	{
		this.line1 = line1;
	}

	//set line 2
	public void setLine2(String line2)
	{
		this.line2 = line2;
	}

	//set city
	public void setCity(String city)
	{
		this.city = city;
	}

	//set state
	public void setState(String state) 
	{
		this.state = state;
	}

	//set zip code
	public void setZip(String zip) 
	{
		this.zip = zip;
	}
	
	//get line 1
	public String getLine1() 
	{
		return line1;
	}
	
	//get line 2
	public String getLine2()
	{
		return line2;
	}
	
	//get city
	public String getCity()
	{
		return city;
	}
	
	//get state
	public String getState() 
	{
		return state;
	}
	
	//get zip code
	public String getZip()
	{
		return zip;
	}

	//returns the following string when it gets called
	public String toString() 
	{
		return "[Address line 1: " + line1 + ", Address line 2: " + line2 + ", City: "
	+ city + ", State: " + state + ", ZIP: " + zip + "]";
	}
}
