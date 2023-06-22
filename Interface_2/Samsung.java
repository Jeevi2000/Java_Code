package Interface_2;

public class Samsung implements Interface_cls
{
	@Override
	public void ram() 
	{
		
		System.out.println(" Ram is 8");
	}

	@Override
	public void camera() 
	{
		 
		System.out.println("camera is 48 mp");
		
	}

	@Override
	public void battery() 
	{
		System.out.println("battery is 45000 mah");
	}

	@Override
	public void price()
	{
		
		System.out.println("price 22000");
	}
}
