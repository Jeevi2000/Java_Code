package com.java.oppsEnheritance;

public class Child_two extends Parents_two {
	public static void main(String[] args)
	{
		Child_two obj=new Child_two();
		//  Grandfather method
		Child_two.proparty();
		obj.farm();
		//Parents two method
		obj.vehical();
		obj.cloths();
		obj.expenses();
		obj.pet();
		// Child two method
		obj.mobail();
	    obj.car();
	    obj.dineer();
	    obj.trip();
		obj.gifts();
	}
	
	public void mobail()
	{
		System.out.println("Im mobail method in child two class");
	}
	public void car()
	{
		System.out.println(" im car method in child two class");
	}
	public void dineer()
	{
		System.out.println("im dinner method in child two class");
	}
	public void trip()
	{
		System.out.println("im trip method in child two class");
	}
	public void gifts()
	{
		System.out.println("im gift method in child two class");
	}
	


}
