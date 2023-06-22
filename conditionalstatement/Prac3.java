package com.java.conditionalstatement;

public class Prac3 {
	public static void main(String[] args) {
		
		int b=60000;
		
		if(b<55000)
		{
			System.out.println("buy iphone");
		}
		else if(b<50000)
		{
			System.out.println("buy one+");
		}
		else if(b<45000)
		{
			System.out.println("buy samsung");
		}
		else if(b<40000)
		{
			System.out.println("buy nokia");
		}
		else if(b<35000)
		{
			System.out.println("buy redmi");
		}
		else if(b<30000)
		{
			System.out.println("buy vivo");
		}
		
		else
		{
			System.out.println("can't buy any phone");
		}
	}

}
