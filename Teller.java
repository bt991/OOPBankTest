package com.ualbany.finalProject;

/*Teller class inherits the Bank class, as it
 * is required by two of the methods within the Bank class
 * that get and set the final format of the teller.
 */
public class Teller extends Bank
{
	//variable declaration
	private String tellerFirst;
	private String tellerLast;
	private int tellerID;
	
	//constructors
	public Teller(String tF, String tL, int tID)
	{
		this.tellerFirst = tF;
		this.tellerLast = tL;
		this.tellerID = tID;
	}
	
	//setter
	public void setTellerFirstName(String tF)
	{
		this.tellerFirst = tF;
	}
	
	//setter
	public void setTellerLastName(String tL)
	{
		this.tellerLast = tL;
	}
	
	//setter
	public void setTellerID(int tID)
	{
		this.tellerID = tID;
	}
	
	//getter
	public String getTellerFirstName()
	{
		return tellerFirst;
	}
	
	//getter
	public String getTellerLastName()
	{
		return tellerLast;
	}
	
	//getter
	public int getTellerID()
	{
		return tellerID;
	}
	
	//toString method outputs the following string to console
	public String toString()
	{
		return "Teller's name: " + tellerLast + ", " + tellerFirst + "\nTeller ID: " + tellerID + ".";
	}
}
