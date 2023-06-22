package Interface_multiple_inheritance;
// class extends class
// class implements interface
// interface extends interface
public class Test_class 
{
 public static void main(String[] args) 
 {
	Class_A a=new Class_C();
	Class_B b=new Class_C();
	Class_C c=new Class_C();
	a.method_A();
	b.method_B();
	a.common_method();// this method are implemented in both parent class
	b.common_method();// thats why both can call it
	
	//one class can extends only one class but one class can implements multiple interface
	
	c.method_A();
	c.method_B();
	c.common_method();
	
}
}
