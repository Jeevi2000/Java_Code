package com.java.constructor;

public class Constructor1 {

	char a;
		
	public void method()
	{
		System.out.println(a);
		// It's a special method of a java class
		// its helps to initialize a state and value during object creation
		// its calls automatically when we create a object of a class using new keyword
	}
	//rule of constructor
	//constructor name is same as class name
	//constructor cannot return any value
	// we can create constructor with any access specifier
	// if we not create any constructor then java compiler provides default constructor
	// we can create program without creating constructor manually
	
		
	public static void main(String[] args) {
		
		Constructor1 ui=new Constructor1();
	    ui.method();
	}
	
}
