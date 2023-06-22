package Inheritance;

public class Test_single_level_inheritance {
	
	public static void main(String[] args)
	{
		System.out.println("parents classmethod=>");
		
		Parent_class obj=new Parent_class();
		obj.car();
		obj.farm();
		obj.house();
		System.out.println("child classmethod using parents class =>");
		Child_class obj2=new Child_class();
		obj2.bike();
		obj2.car();
		obj2.tv();
		obj2.house();
		obj2.farm();
	}

}
