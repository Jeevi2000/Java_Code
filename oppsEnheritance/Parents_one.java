package com.java.oppsEnheritance;

public class Parents_one extends Child_one
{
	public static void main(String[] args)
	{
		Parents_one obj=new Parents_one();
		//Child one methods
		obj.mobail();
		obj.car();
		obj.dineer();
		obj.trip();
		obj.gifts();
		//Parents one method
		obj.home();
		obj.vehical();
		obj.cloths();
		obj.expenses();
		obj.pet();
		
	}
	
	public void home()
	{
		System.out.println("IM home method in parents one class");
	}
	public void vehical()
	{
		System.out.println("im vehical method in parents one class");
	}
	public void cloths()
	{
		System.out.println("im cloths method from paretns one class");
	}
	public void expenses()
	{
		System.out.println("im expenses mehthod in parents one class");
	}
	public void pet()
	{
		System.out.println("im gift method in parents one class");
	}
	

}
