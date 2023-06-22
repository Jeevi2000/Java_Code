package polymorphism_override_static;

public class Test_class {
	public static void main(String[] args) 
	{
		Parent.greeting();
		Child.greeting();
		Parent p=new Child();// using parent class reference making object of child class
		p.greeting();
		// in static the override method is hidden.
		// thats why you can not override static method 
		p.private_method();// you also cant override private method of parent class
	}

}
