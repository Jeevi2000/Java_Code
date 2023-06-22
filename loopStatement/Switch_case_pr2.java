package com.java.loopStatement;
import java.util.*;

public class Switch_case_pr2 {
	public static void main(String[]args) {
		
	         Scanner sc = new Scanner(System.in);
			
			int deposit=0;
			int withdraw=0;
			int total_amount=0;
			int password=1234;
			int ch=0;
			System.out.println("enter a password");
			int pass=sc.nextInt();
			
		if (pass==1234)
		{
			
		while(ch<=4)
		{
			System.out.println("enter a no 1.deposite /n 2.withdraw /n 3.balance /n 4.exit");
			 ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter a deposite amount");
				deposit=sc.nextInt();
				total_amount+=deposit;
				System.out.println(deposit+" amount is succesfully deposited and total amout is "+total_amount);
				break;
			case 2:
				System.out.println("enter a withdraw amount");
				withdraw=sc.nextInt();
				if (total_amount==0)
				{
					System.out.println("amount is not sufficient");	
				}
				else
				{
				total_amount=deposit-withdraw;
				System.out.println("withdraw amount is "+withdraw+" and total amount is "+ total_amount);
				
				}
				break;
			case 3:
				System.out.println("the amount in your account is "+ total_amount);
				break;
				
				
			case 4:
				
					System.out.println("you can exit 👍,thank you for visit 😇");
					break;
					
					
			default:
				System.out.println("sorry 🥺 cant recognize ");
						break;
						
					
					
		
			
				
			}
		 }
		}
		
		else
		{
			System.out.println("invalid user");
		}
			
	}

}
