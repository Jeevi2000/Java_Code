package abstract_method;

public class Concrete_class extends Abstract_class 
{

	@Override
	public void sub()
	{
		System.out.println("Im sub method from sub class");
		
	}

	@Override
	public void add() 
	{
		System.out.println("Im add method from add class");
		
	}

	@Override
	public void multi() 
	{
		System.out.println("Im multi method from multi class");
		
	}

	@Override
	public void divid() {
		
		System.out.println("Im divid method from divid class");
	}

	@Override
	public void gold() {
		
		System.out.println("Im sub method from super class");
	}

	@Override
	public void silver() {
		
		System.out.println("Im silver method from super class");
	}

	@Override
	public void metal() {
		
		System.out.println("Im metal method from super class");
	}

	@Override
	public void plastic() {
		
		
		System.out.println("Im Plastic method from super class");
		
		
	}
	
	public static void main(String[] args) 
	{ 
		Concrete_class obj=new Concrete_class();
		
		System.out.println("*********sub class method********");
		System.out.println();
		obj.add();
		obj.divid();
		obj.multi();
		obj.sub();
		System.out.println();
		System.out.println("*********super class method********");
		System.out.println();
		obj.gold();
		obj.metal();
		obj.silver();
		obj.plastic();
		
	}

}
