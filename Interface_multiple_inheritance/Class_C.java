package Interface_multiple_inheritance;

public class Class_C  implements Class_A,Class_B
{

	@Override
	public void method_B() 
	{
     System.out.println("method from parent interface class B");
		
	}

	@Override
	public void method_A() 
	{
		 System.out.println( " method from parent interface class A ");

	}

	@Override
	public void common_method() // this method written only one time because
	                            // this method is same in both parent class A and B 
	{

		 System.out.println("common method from both class ");
		
	}
	
}
