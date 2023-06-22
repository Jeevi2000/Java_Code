package com.java.conditionalstatement;

public class Prac_6 {
	
	public static void main(String[] args)
	{
		int day=7;
		
		switch (day)
		{
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tusday");
			break;
		case 3:
			System.out.println("wednesday");
			break;	
		case 4:
			System.out.println("thirsday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("Invalid input from user");
			break;	
		}
	
		// if  else can gives either true or false value and in switch we can choice one case from multiple statement
	}

}
