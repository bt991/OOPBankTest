package com.ualbany.finalProject;

public enum BranchNum
{
	//enum for branch name and number
	HUDSON ("Hudson", 2839),
	GREENE ("Greene", 8234),
	DUTCHESS ("Dutchess", 1562),
	UNION ("Union", 9207);
	
	//variable declaration
	private String branchName;
	private int branchNum;
	
	//constructors
	private BranchNum (String branchName, int branchNum)
	{
		this.branchName = branchName;
		this.branchNum = branchNum;
	}
	
	//gets name of the branch
	public String getBranchName()
	{
		return branchName;
	}
	
	//gets number of the branch
	public int getBranchNum()
	{
		return branchNum;
	}
}
