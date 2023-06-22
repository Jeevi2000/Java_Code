package com.java.generalization_in_abstraction;

public class Airtel_class extends Network_class
{

	@Override
	public void calling() 
	{
		System.out.println("calling is unlimed in airtel sim");
		
	}

	@Override
	public void monthly_pack_price()
	{
		System.out.println(" monthly pack is 300 ");
		
	}
	public void hotstar()
	{
		System.out.println(" hotstar subscription is free ");
		
	}
	

}
