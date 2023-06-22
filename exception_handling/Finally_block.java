package exception_handling;

import java.util.Scanner;

public class Finally_block 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a two no ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println("division is "+c);
			
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
			System.out.println("catch block "+ex.toString());
			System.exit(0);//if system.exit() is called then its not calling finally bloc
			//System.exit(0) is used to indicate successful termination.(normal)
			//System.exit(2) is used to indicate unsuccessful termination.(abnormal)
		}
		finally
		//we can use finally block after try but this is not recommended 
		// if exception is throw in program and its checked exception then 
		// writing catch is compulsory.
		{
			sc.close();
			System.out.println("division by zero");
		}
	}

}
