package This_and_super;

public class THis_key_word  {
	 int a=30;
	 static int b=40;
	 int c=78;
	
	
	
	public static void method1()
	{
		THis_key_word obj=new THis_key_word();
	      int a=20;
	      int b=50;
		System.out.println(a);
		System.out.println(obj.a);//Non static method is call by class object if its have local too or not
		System.out.println(THis_key_word.b);
		//Static variable call by class name in static method 
		//when you have same local name variable in method  
		System.out.println(b);
		System.out.println(obj.c);//non static variable
		
		
		
	}
	
	    public void non_static()
	    {
	    	int a=70;
	    	int b=60;
	    	System.out.println(a);
	    	System.out.println(this.a);// this key word only work in non static method
	    	System.out.println(b);
	    	System.out.println(this.b);
	    }
	
	

	public static void main(String[] args)
	{
		System.out.println("Static method");
		method1();
		System.out.println();
		System.out.println("non static method");
		THis_key_word obj=new THis_key_word();
		obj.non_static();
		
		
		
	}
	
}
