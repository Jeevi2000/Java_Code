package com.java.abstract_;

public class Current_Account extends Account {
	
	Current_Account(String accNo, String accHolderName,double balance)
	{
		super(accNo,accHolderName,balance);// pass in parent class constructor
	}

	@Override
	public void withdraw(double amount) 
	{
		if (getBalance()>amount)
		{
			setBalance(getBalance()-amount-15);
			System.out.println("amount is Succesfully debited" +amount);
		}
		else
		{
			System.out.println("No balance available to withdraw");
			System.out.println(" your current balance is "+getBalance());
		}

	}

}
