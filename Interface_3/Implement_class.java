package Interface_3;

public class Implement_class implements  Interface_1 ,Interface_2 ,Interface_3
{

	@Override
	public void Interface_3_method_1() 
	{
		System.out.println("method 1 from Interface class 3");
	}

	@Override
	public void Interface_3_method_2() 
	{
		System.out.println("method 2 from Interface class 3");
		
	}

	@Override
	public void Interface_2_method_1() 
	{
		System.out.println("method 1 from Interface class 2");
		
	}

	@Override
	public void Interface_2_method_2() 
	{
		System.out.println("method 2 from Interface class 2");
		
	}

	@Override
	public void Interface_1_method_1() 
	{
		System.out.println("method 1 from Interface class 1");
		
	}

	@Override
	public void Interface_1_method_2() 
	{

		System.out.println("method 2 from Interface class 1");
		
	}

	
}
