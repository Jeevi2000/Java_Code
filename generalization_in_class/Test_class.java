package com.java.generalization_in_class;

public class Test_class {
	public static void main(String[] args) 
	{
		Child_1 obj1= new Child_1();
		
		System.out.println("------------------------**************************-----------------------");
		System.out.println();
		obj1.parent_method_1();
		obj1.parent_method2();
		obj1.Child_1_method_1();
		obj1.Child_1_method_2();
		System.out.println();
		System.out.println("------------------------**************************-----------------------");
		System.out.println();
       Child_2 obj2= new Child_2();
       obj2.parent_method_1();
		obj2.parent_method2();
		obj2.Child_2_method_1();
		obj2.Child_2_method_2();
		
		
	}

}
