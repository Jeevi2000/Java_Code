package exception_handling;

public class Multiple_catch_block 
{

	public static void main(String[] args) 
	{
		/*multiple catch block
	     - For each try block there can be zero or more catch blocks ,but only one 
	       finally block.
	     - So,we can handle different exception by using one try and multiple catch blocks.
	     - Exception order must maintained from specific exception to general exception.
	    */
		
		try {
			int num =10/0;
			int nums[]= {10,23,34,45,67,8};
			System.out.println(nums[6]);
			String name=null;
			System.out.println(name.length());
			}
		catch(ArithmeticException ex)
		{
			System.out.println("Arithmetic exception occured");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("ArrayIndexOutOfBounds exception occured");

		}
		catch(NullPointerException ex)
		{
			System.out.println("NullPointerException occured");
	
		}
		catch(Exception ex)
		{
			System.out.println("genral exception occured");
		}
		
	}
}
