package exam;

import java.util.Scanner;

public class Question_3_Prime_not_Prime {

	public static void main(String[] args) 
	{
		System.out.println("enter a no ");
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Your no is not prime number");
		}
		else
		{
			System.out.println("Your no is prime number");
		}
	}
	
}
