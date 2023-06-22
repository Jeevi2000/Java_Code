package String_;

import java.util.Scanner;

public class Demo_3 
{
	public static void main(String[] args)
	{
		String userName=new String("gaurav sapkal");
		
		String userPassword=new String("1234");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a user name");
		String userId=sc.nextLine();
		
		System.out.println("enter a user password");
		String userPass=sc.nextLine();
		
		if(userName.equals(userId)&&userPassword.equals(userPass))
		{
			System.out.println(" succesfully login");
			
		}
		else
		{
			System.out.println(" Wrong info");
		}
		
		
		
	}

}
