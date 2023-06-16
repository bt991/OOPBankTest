package com.ualbany.finalProject;

/*Branch interface, contains numerous abstract methods
 * which the Bank class implements and defines.
 */
public interface Branch 
{
	void setBranch(BranchNum branch);
	void getBranchName();
	void getBranchNum();
	void setPerson(Person p);
	void getPerson();
}
