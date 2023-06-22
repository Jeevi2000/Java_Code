package Array;

public class Array_doublicate 
{
	public static void main(String[] args) 
	{
		int array[]= {32,4,2,4,22,44,323,323};
		 for(int i=0;i<array.length;i++)
		 {
			 int count=0;
			 int j=0;
			 
				 while( j<array.length)
				 {
					if(array[i]==array[j]) 
					{
			       count=count+1;
					}
					j++; 
					
			       
				 }	 
				 System.out.println(array[i]+"="+count);
				
				
			 
			 
		 }
		 	
	}

}
