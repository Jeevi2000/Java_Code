package com.java.method;

import com.java.method_2.Class1;
import com.java.method_2.Class2;
import com.java.method_2.Class3;

public class Method_class1 {
	public static void main(String[] args) {
		// we can call static method using object but this not good operoch
		
		//Static method from same class
		gaurav();
		prerna();
		prathamesh();
		cartoon();
		pokemon();
		sanjay();
		//Non static method from same class
		Method_class1 obj=new Method_class1();
		obj.sheru();
		obj.shimala();
		obj.coconut();
		obj.pottato();
		obj.tommato();
		obj.bhendi();
		//Static method from different class
		Method_class2.name1();
		Method_class2.name2();
		Method_class2.name3();
		Method_class2.name4();
		Method_class2.name5();
		Method_class2.name6();
		Method_class2.name7();
		Method_class2.name8();
		Method_class2.name9();
		Method_class2.name10();
		Method_class2.name11();
		Method_class2.name12();
		// Non static method from different class
		Method_class3 obj2 =new Method_class3();
		obj2.name13();
		obj2.name14();
		obj2.name15();
		obj2.name16();
		obj2.name17();
		obj2.name18();
		obj2.name19();
		obj2.name20();
		obj2.name21();
		obj2.name22();
		obj2.name23();
		obj2.name24();
		// Static method from different Package class
		Class1.name25();
		Class1.name26();
		Class1.name27();
		Class1.name28();
		Class1.name29();
		Class1.name30();
		Class1.name31();
		Class1.name32();
		Class1.name33();
		Class1.name34();
		Class1.name35();
		Class1.name36();
		Class2.name37();
		Class2.name38();
		Class2.name39();
		Class2.name40();
		Class2.name41();
		Class2.name42();
		Class2.name43();
		Class2.name44();
		Class2.name45();
		Class2.name46();
		Class2.name47();
		Class2.name48();
		// Non static method from different class package
		Class3 obj3=new Class3();
		obj3.name49();
		obj3.name50();
		obj3.name51();
		obj3.name52();
		obj3.name53();
		obj3.name54();
		obj3.name55();
		obj3.name56();
		obj3.name57();
		obj3.name58();
		obj3.name59();
		obj3.name60();
		
	}
	public static void gaurav ()
	{
		System.out.println("im gaurav ");
	}
	public static void prerna ()
	{
		System.out.println("im prerna");
	}
	public static void  prathamesh ()
	{
		System.out.println("im prathamesh");
	}
	public static void  cartoon ()
	{
		System.out.println("im cartoon ");
		
	}
	public static void  pokemon ()
	{
		System.out.println("im pokemon ");
		
	}
	public static void  sanjay ()
	{
		System.out.println("im sanjay ");
	}
	public  void  sheru ()
	{
		System.out.println(" im sheru");
	}
	public  void  shimala ()
	{
		System.out.println("im shimala");
		
	}
	public void  coconut ()
	{
		System.out.println("im coconut");
		
	}
	
	public  void  pottato ()
	
	{
		System.out.println("im pottato");
	}
	public void  tommato ()
	{
		System.out.println("im tommato");
		
	}
	public void  bhendi ()
	{
		System.out.println("im bhendi");
	}
	
}




