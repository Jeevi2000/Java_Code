package com.java.Engineering;

import com.java.Placment_.Traning;

public class CSE {


	
	public static void main(String[] args) {
		Mechanical.compalsary_subject();
		// non static method 
		Mechanical obj=new Mechanical();
		obj.elective_subject();
		Traning.language();
		Traning obj2=new Traning();
		obj2.apttitude();
		CSE.Java();
		CSE obj3=new CSE();
		obj3.python();
		
		
	}
	public static void Java() {
		System.out.println("java subject");
		
		
	}
	public void python()
	{
		System.out.println("python subject");
		
	}
}  

