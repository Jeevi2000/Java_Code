package com.java.methods_with_parameter;

public class Method_with_Parameter {
	public static void main(String[]args) {
		
		substraction();// calling method with non arguments
		substraction2(12,34);//calling method with arguments
		adding("gaurav ","sapkal");
		// parameter are pass when method was declare and the argument are use when we call the method
		// function and method are only difference is the method is associated with object
		// and function is not
		
	}
	public static void substraction()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
		//method with no parameter
	}

	public static void substraction2(int a,int b)// parameter passing
	{
		
		int c=a-b;
		System.out.println(c);
		//method with  parameter
	}
    public static void adding(String d,String s)
    {
    	String g=d+s;
    	System.out.println(g);
    }
}
