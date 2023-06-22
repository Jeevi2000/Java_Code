package com.java.abstract_;

abstract public class Account
{
 private String accNo;
 private String accHolderName;
 private double balance;
  public Account( String accNo, String accHolderName,double balance)//for set value for all methods
  {
	  this.accNo=accNo;
	  this.accHolderName=accHolderName;
	  this.balance=balance;
		  
  }
public String getAccNo() { // lower camel case
	return accNo;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAccHolderName() {
	return accHolderName;
}
public double getBalance() {
	return balance;
}
  public  double deposite(double amount)
  
  {
	balance+=amount; 
	System.out.println("deposite amount is "+amount+" and totoal balance is "+getBalance());
	return amount;
  }
  abstract public void withdraw(double amount); // abstract method have no body
  // if method is abstract then the  class should be abstract
  // this method can structures in child class 
  // child class have there own method like withdraw
  
	
}
