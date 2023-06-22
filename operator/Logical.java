package com.java.operator;

public class Logical {
	public static void main(String[] args) {
		
		int boy=25;
		int girl=30;
		if(boy>26 && girl>31)
		{
			System.out.println("session is allowed");
		}
		else
		{
			System.out.println("session is not allowed");	
		}
		if(boy<26 || girl>31)
		{
			System.out.println("session is allowed");
		}
		else
		{
			System.out.println("session is not allowed");
		}
	
	}

}
