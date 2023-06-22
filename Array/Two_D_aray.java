package Array;

public class Two_D_aray 
{
public static void main(String[] args) 
{
	int nums[][]=new int[3][3];// declare the two d array
	int nums2[][]= {{0,1,2},{3,'c',5},{6,7,8}};// two dimensional direct array with value
	int nums3[]= {3,1,7};// single dimensional direct array with value
	
	// if you want to access single element then we can directly access using index number.
	System.out.println(nums2[1][1]);
	System.out.println();
	System.out.println("print array using for loop");
	System.out.println();
	
	for(int row=0;row<nums2.length;row++)
	{
		for(int col=0;col<nums2[row].length;col++)
		{
			System.out.print(nums2[row][col]+"\t");
			
		}
		
		
		System.out.println();
		
}
	System.out.println();
	System.out.println("printing array using for each loop");
	System.out.println();
	for(int row[]:nums2)//declare the row
	{
		for(int col:row)//and printed the element of each row
		{
			System.out.print(col+"\t"); // "\t" for tab after one element in row
		}
		System.out.println();
	}
}
}
