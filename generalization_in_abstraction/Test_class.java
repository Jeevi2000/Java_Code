package com.java.generalization_in_abstraction;

public class Test_class 
{
	public static void main(String[] args) 
	{
	Jio_class obj1= new Jio_class();
	Airtel_class obj2= new Airtel_class();
	
	obj1.calling();
	obj1.monthly_pack_price();
	obj1.jio_cinema();
	System.out.println();
	System.out.println("--------------------------*************************------------------------");
	System.out.println();
	obj2.calling();
	obj2.monthly_pack_price();
	obj2.hotstar();
	
	
	
		
	}

}
