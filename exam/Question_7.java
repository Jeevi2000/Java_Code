package exam;
import java.util.Scanner;
public class Question_7 {
	
	public static void main(String[] args)
	{
		
		
		System.out.println("enter a ID ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==24)
		{
			System.out.println("enter a password ");
			int b=sc.nextInt();
			if(b==1234)
			{
				System.out.println("login succesfully ");
			}
			else
			{
				System.out.println("wrong pass ");
			}
			
		}
		else
		{
			System.out.println("invalid Id ");
		}
	}

}
