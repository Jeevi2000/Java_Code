package abstract_package_2;

public class Sample_2 extends Sample_1 // abstract class method are calling in concrete class 
{

	@Override
	public void addition(int a, int b) 
	{
		System.out.println("addition  is "+(a+b));
		
	}

	@Override
	public void substraction(int a, int b) 
	{
		System.out.println("substraction is "+ (a-b));
		
	}

	@Override
	public void multiplication(int a, int b) 
	{
		
		System.out.println("multiplication is "+(a*b));
	}

	@Override
	public void division(int a, int b) 
	{
		System.out.println("division is "+(a%b));
	}
	
	public static void main(String[] args) 
	{
		Sample_1 obj=new Sample_2();
		obj.addition(10,20);
		obj.division(30, 40);
		obj.multiplication(50,60);
		obj.substraction(70, 80);
	}

}
