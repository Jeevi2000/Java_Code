package com.java.constructor;

public class User_define_constructor {
	
	int a;
	float b;
	String c;
	char f;
	boolean d;
	 
//	User_define_constructor() ---> by default constructor is create like this 
//	
//	{
//		
//		
//	}
	
	
	
	public void method2(int a ,int b,int c) //---> parameterized constructor
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
	}


	public static void main(String[] args)
	{
		User_define_constructor obj= new User_define_constructor ();// create an object of an class
		obj.method2(10,20,30);
		
		
	}
}
