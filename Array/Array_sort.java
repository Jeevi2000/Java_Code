package Array;

public class Array_sort 
{
public static void main(String[] args) 
{
	Integer c[]= {34,6,89,32,667,2,0,1};// sorting array
	System.out.println();
	System.out.println("Ascending order");
	System.out.println();
	for (int i=0;i<c.length;i++)// Ascending order
	{
		for(int j=0;j<c.length-1;j++)
		{
			if(c[j+1]<c[j])
			{
				int d=c[j+1];
				c[j+1]=c[j];
				c[j]=d;
				
			}
			
			
		}
		
	}
	for(int ele:c)
	{
		System.out.print(ele+",");
	}
	System.out.println();
	System.out.println("Decending order");
	System.out.println();
	
	
	for (int i=0;i<c.length;i++)// Descending order
	{
		for(int j=0;j<c.length-1;j++)
		{
			if(c[j+1]>c[j])
			{
				int d=c[j];
				c[j]=c[j+1];
				c[j+1]=d;
				
			}
			
			
		}
		
	}
	for(int ele:c)
	{
		System.out.print(ele+",");
	}
}
}
