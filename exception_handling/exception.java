package exception_handling;

import java.util.Scanner;

import com.java.operator.Arithmatic;

public class exception 
{
	//Exception : Which is caused by the program/user entered input.
	//That can be handled, which is called Exception Handling.
	//e.g. NullPointerException,ClassNotFoundException
	
	
	//Error : It is caused due to some system to resources.;
	//Which is not recovered by writing some code.
	//e.g. StackOverFlow, OutOfMemory
	
	//type of Exception
	//1)Unchecked Exception(Run time exception)
	//2)Checked Exception(Compile time Exception)
	
	//1)-->Occurs at the time of execution.
	//     because of user input or wrong code can cause this exception
	//     It isn't required to be handled.
	
	
	//2)-->Occurs at the time of compilation.
	//     we must have to handle this code before compilation.
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a  2 no");
	int a=sc.nextInt();
	int b=sc.nextInt();
	try {   // try{} block that possible error is occur
		int c=a/b;
		System.out.println(c);
		System.out.println("exception is not occure");
	}
	catch(ArithmeticException ex)//catch block where the output of after error is occur
	{
		ex.printStackTrace();// give the track the error is occur
		System.out.println("exception occure"+ex.toString()); 
		// toString() convert the error into string
	}
	
	
	
	}
}
