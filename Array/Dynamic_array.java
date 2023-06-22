package Array;

import java.util.Scanner;

public class Dynamic_array 
{
	public static void main(String[] args) 
	{
		int myArray[]= new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0 ;i<myArray.length;i++)
		{
			System.out.println("enter a any no");
			myArray[i]=sc.nextInt();	
			
		}
		System.out.println();
		System.out.println("index array ");
		System.out.println();
		System.out.println(myArray[1]);//printing single array element using index
		System.out.println();
		
		 System.out.println("print my full array");
		 for(int i=1;i<myArray.length;i++)
		 {
			 System.out.println(myArray[i]);
		 }
		 //advance for loop also called as for each loop
		 System.out.println();
		 System.out.println("for each loop");
		 System.out.println();
		 for(int ele:myArray)
		 {
			 System.out.println(ele);// if you only want to print then you can use for each loop
			                         // but if you to access a element using index then go with for loop  
		 }
		 
		 
		
		
	}

}
