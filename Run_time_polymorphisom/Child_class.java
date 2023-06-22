package Run_time_polymorphisom;

public class Child_class extends Parent_class{
	public static void main(String[] args)
	{
		Child_class obj =new Child_class();
	     obj.method1();
	}
	@Override
	public  void method1()
	{
		super.method1();
		System.out.println("IM overrided method on child  class");
	}

}
