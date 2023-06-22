package exam;

import java.util.Scanner;

public class Question_10_calculator {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a option 1.add\n 2.sub\n 3.multi \n 4.divide");
		int v=sc.nextInt();
		switch(v)
		{
		case 1:
			System.out.println("for additon enter 2 no");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("additon of two no is "+c);
			break;
		case 2:
			System.out.println("for substraction enter 2 no");
			int e=sc.nextInt();
			int f=sc.nextInt();
			int g=e-f;
			System.out.println("substraction of two no is "+g);
			break;
		case 3:
			System.out.println("for multiplication enter 2 no");
			int h=sc.nextInt();
			int i=sc.nextInt();
			int j=h*i;
			System.out.println("multiplication of two no is "+j);
			break;
		case 4:
			System.out.println("for dividation enter 2 no");
			int k=sc.nextInt();
			int l=sc.nextInt();
			int m=k/l;
			System.out.println("dividation of two no is "+m);
			break;
			default:
				System.out.println("invalid option");
				
			
			
		}

		
	}

}
