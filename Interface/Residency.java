package com.java.Interface;

public class Residency implements Building{

	@Override
	public void bhk1() 
	{
		
	
		System.out.println("this flat have 1 bedroom, 1 hall and 1 kitchen");
	}

	@Override
	public void bhk2() 
	{
		
		System.out.println("this flat have 1 bedroom,1 masterbedroom , 1 hall and 1 kitchen");
	}

	@Override
	public void bhk3()
	{
		
		System.out.println("this flat have 1 bedroom, 2 masterbedroom , 1 hall and 1 kitchen");
	}

	@Override
	public void bhk4() 
	{
		
		System.out.println("this flat have 1 bedroom, 3 masterbedroom and 1 kitchen");
	}

	@Override
	public void bhk5() {
		
		System.out.println("this flat have 1 bedroom, 4 masterbedroom 1 hall and 1 kitchen");
	}

}
