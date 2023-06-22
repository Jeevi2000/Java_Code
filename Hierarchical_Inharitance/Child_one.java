package Hierarchical_Inharitance;

public class Child_one extends Parents_class{
	public static int b=20; //all over the project
	 static int c=30;// with in package
	 private static int d=40;// with in class
	 protected static int e=50;// with in package and child class
	 
	public static void main(String[] args)
	{
		
	}
	public void child_one_method_one()
	{
		System.out.println("method one from child one class");
	}
	public void child_one_method_two()
	{
		System.out.println("method two from child one class");
	}
	public void child_one_method_three()
	{
		System.out.println("method three from child one class");
	}
	public void child_one_method_four()
	{
		System.out.println("method four from child one class");
	}

}
