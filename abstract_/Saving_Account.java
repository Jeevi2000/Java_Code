package com.java.abstract_;

public class Saving_Account extends Account {
	
	Saving_Account(String accNo, String accHolderName,double balance)
	{
		super(accNo,accHolderName,balance);// pass in parent class constructor
		                                   // invoke parent class constructor with child class constructor 
	}                                      // by default its give default constructor 
	                                       // to invoke parent class constructor child class also need parameter
	                                       // and use super key to invoke  it

	@Override
	public void withdraw(double amount) 
	{
		if (getBalance()>amount)
		{
			setBalance(getBalance()-amount);
			System.out.println("amount is Succesfully debited" +amount+" And total balance is "+getBalance());
			
		}
		else
		{
			System.out.println("No balance available to withdraw");
			System.out.println(" your current balance is "+getBalance());
		}

	}

}
