package com.ualbany.finalProject;

/*Bank class, houses a lot of the code which creates important
 * objects and also returns some of their values. Bank class also
 * implements the Branch interface
 */
public class Bank implements Branch
{
	//object declaration
	private BranchNum branch;
	private Teller t;
	private Person p;

	//sets value to BranchNum enum
	public void setBranch(BranchNum branch)
	{
		this.branch = branch;
	}
	
	//returns the branch name (location) of the bank
	public void getBranchName()
	{
		System.out.println("Branch name: " + branch.getBranchName());
	}
	
	//returns the branch number of the bank
	public void getBranchNum()
	{
		System.out.println("Branch number: " + branch.getBranchNum());
	}
	
	//sets the values of the bank teller
	public void setTeller(Teller t)
	{
		this.t = t;
	}
	
	//returns the bank teller's information
	public void getTeller()
	{
		System.out.println(t);
	}
	
	//sets the values of the bank's customer
	public void setPerson(Person p)
	{
		this.p = p;
	}
	
	//returns the information of the bank's customer
	public void getPerson()
	{
		System.out.println(p);
	}
}
