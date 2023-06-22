package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotfoundError 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader f=new FileReader("D://test//hello//.txt");
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
			System.out.println("file not found "+ ex.toString());
		}
		finally
		{
			System.out.println("finally block");
		}
		
	}

}
