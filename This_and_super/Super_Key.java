package This_and_super;
import this_and_super2.Super_class2;

public class Super_Key extends Super_class2  {
	static int a=40;
	  int b=50;

	public static void main(String[] args)
	{
		
		Super_Key obj2=new Super_Key();
		obj2.class1();
		System.out.println("**************************");
		Super_Key.class2();
		System.out.println("**************************");
		
	}
	@Override
	public void class1()
	{
		super.class1();// when you want to access parent class method then you use super keyword
		System.out.println("Im overridin method of an super class(child class of an super2 class from differenr package) ");

		System.out.println(this.b);
		System.out.println(super.g);
		System.out.println(super.r);
		Super_class2 obj3=new Super_class2();
		System.out.println(obj3.g);

	}
}
