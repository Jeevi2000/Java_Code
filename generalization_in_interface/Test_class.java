package com.java.generalization_in_interface;

public class Test_class 
{
public static void main(String[] args) 
{
	Child_1 obj1 = new Child_1();
	Child_2 obj2 = new Child_2();
	
	obj1.child_1_method();
	obj1.parent_method_1();
	obj1.parent_method_2();
	System.out.println();
	System.out.println("--------------------------*************************------------------------");
	System.out.println();
	obj2.child_2_method();
	obj2.parent_method_1();
	obj2.parent_method_2();
	
}
	
}
