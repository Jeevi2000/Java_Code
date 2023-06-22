package com.java.method_3;

import com.java.method_4.Non_static_diff_package;

public class Diff_class_non_static {
	
	
	int a=100;
	public static void main(String[] args)

	{
		
		// calling nonstatic same class
		Diff_class_non_static obj =new Diff_class_non_static();
		obj.method3();
		obj.method4();
		
		//non static call from diff class
		
		Non_static_method obj2=new Non_static_method();
		obj2.method9();
		obj2.method10();
		
		// calling from diffpack
		
		Non_static_diff_package obj3=new Non_static_diff_package();
		obj3.method4();
	
		
				
		
	}
	public void method3()
	{
		Non_static_diff_package ob=new Non_static_diff_package();
		System.out.println(ob.b);// different package variable
		System.out.println("engineering");
	}
	public void method4()
	{
		System.out.println("managment");
	}
}
