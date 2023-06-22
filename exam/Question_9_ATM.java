package exam;

import java.util.Scanner;

public class Question_9_ATM {
	
	static int total=0;
	static int password=1234;
	
	public static void main(String[] args) 
	{
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a password");
		int v=sc.nextInt();
		if(v==password)
			
		
		{
		while(true)
		{
		
		System.out.println("choice option \n 1.withdrow \n 2.deposite \n 3.credit \n 5.home page");
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("enter a amount for withdrow ");
			a=sc.nextInt();
			int c=total-a;
			total=c;
			System.out.println("amount is withdrowed "+a+"and total amount is "+total);
			break;
		case 2:
			System.out.println("enter a amount for deopsite ");
			a=sc.nextInt();
			int d=total+a;
			total=d;
			System.out.println("amount is debited "+a+"and total amount is "+total);
			break;
		
	
			
		  case 3:
				System.out.println("enter a amount for credit ");
				a=sc.nextInt();
				int l=total+a;
				total=l;
				System.out.println("amount is credited "+a+"and total amount is "+total);
			break;
		case 4:
			
			System.out.println(" back to home page thank you for visiting");
			break;
			
			
			
		
		}
		
		
	}
		}
		else
		{
			System.out.println("wrong password");
		}
}
}
