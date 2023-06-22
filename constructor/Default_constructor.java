package com.java.constructor;

public class Default_constructor {
	
	int a;
	float b;
	String c;
	char f;
	boolean d;
	double h;
	long i;
	byte r;
	// default constructor called as no parameters constructor
	// if we create object of class without any arguments then values for all the objects will be same
	
	
	public void default2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);
		System.out.println(h);
		System.out.println(i);
		System.out.println(r);
	}
	
	public static void main(String[] args)
	{
		Default_constructor obj=new Default_constructor();
		obj.default2();
	}

}
