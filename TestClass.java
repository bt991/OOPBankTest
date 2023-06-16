package com.ualbany.finalProject;

import java.text.NumberFormat;
import java.util.ArrayList;

public class TestClass
{
	public static void main(String[] args)
	{
		NumberFormat form = NumberFormat.getCurrencyInstance(); //numberformat object to format currency
		
		Branch b = new Bank(); //instantiate a new bank class via the branch interface
		BranchNum branch = BranchNum.GREENE; //setting the enum value to be "GREENE"
		Teller t = new Teller("Jerry", "Jones", 29); //instantiate a new teller class with the corresponding fields
		Address a = new Address("PO Box 123", "834 Reading Street", "Albany", "New York", "12205"); //instantiate a new Address
		
		Account acc = new SavingsAccount(0, 0); //instantiate a new SavingsAccount with Account class reference
		SavingsAccount sav = new SavingsAccount(0, 0); //instantiate a new SavingsAccount
		CheckingAccount check = new CheckingAccount(0, 0); //instantiate a new CheckingAccount
		
		Person p = new Person("Brett", "Thornton", a, acc); //instantiate a new Person, contains Address and Account objects
		
		ArrayList<Double> list1 = new ArrayList<>(); //creating an arraylist of type double
		ArrayList<String> list2 = new ArrayList<>(); //creating an arraylist of type string
		
		b.setBranch(branch); //uses enum value 'branch' to set branch via Branch's interface bank instance
		b.getBranchName(); //gets branch name from enum, returns via instance of bank class
		b.getBranchNum(); //gets branch number from enum, returns via instance of bank class
		t.setTeller(t); //collects Teller object t and sets teller information accordingly
		t.getTeller(); //returns output from getTeller method of Bank class
		b.setPerson(p); //collects Person object p and sets person information through Bank class instance
		b.getPerson(); //returns person information
		
		sav.credit(1500); //accesses SavingsAccount object to credit balance by 1500
		check.credit(1000); //accesses CheckingAccount object to credit balance by 1000
		list1.add(1500.00); //adds the value which is credited to ArrayList of type double for logging
		list1.add(1000.00); //adds the value which is credited to ArrayList of type double for logging
		list2.add("Savings"); //adds this string to ArrayList of type String for logging
		list2.add("Checking"); //adds this String to ArrayList of type String for logging
		
		acc.calculateTotal(sav.getBalance(), check.getBalance()); //calculates total with current balance from both objects
		System.out.println("Total balance of both accounts: " + form.format(acc.getTotal())); //prints total with correct format
		System.out.println("Savings account balance: " + form.format(sav.getBalance())); //prints SavingsBalance with correct format
		System.out.println("Checking account balance: " + form.format(check.getBalance())); //prints CheckingBalance with correct format
		
		
		System.out.print("\nProcessing new transactions.\n"); //prints line
		
		sav.credit(5000); //accesses SavingsAccount object to credit balance by 5000
		check.debit(750); //accesses CheckingAccount object to debit balance by 750
		list1.add(5000.00); //adds the value which is credited to ArrayList of type double for logging
		list1.add(750.00); //adds the value which is debited to ArrayList of type double for logging
		list2.add("Savings"); //adds this string to ArrayList of type String for logging
		list2.add("Checking"); //adds this string to ArrayList of type String for logging
		
		acc.calculateTotal(sav.getBalance(), check.getBalance()); //calculates total with current balance from both objects
		System.out.println("\nTotal balance of both accounts: " + form.format(acc.getTotal())); //prints total with correct format
		System.out.println("Savings account balance: " + form.format(sav.getBalance())); //prints SavingsBalance with correct format
		System.out.println("Checking account balance: " + form.format(check.getBalance())); //prints CheckingBalance with correct format
		System.out.println("Accessing transaction log...\n"); //prints line
		
		System.out.printf("%-10s%-10s\n", "Account", "Amount"); //prints formatted line
		
		//for loop to run the following statement
		for(int index=0; index < list1.size(); index++)
		{
			//prints the contents of both ArrayLists in the following format to simulate a "transaction log"
			System.out.printf("%-10s$%-10.2f\n", list2.get(index), list1.get(index));
		}
	}
}
