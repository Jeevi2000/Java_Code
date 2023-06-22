package polymorphism_override_static;

public class Child extends Parent
{

	public void print()
	{
		System.out.println(" this my print method");
	}
	// method is hidden  in override case in static method
	public static void greeting()
	{
		System.out.println("gretting method in child class");
	}
	 static void private_method()
	{
		System.out.println("Private method of child class");
	}
}
