package Interface_2;

public class Test_class
{
	public static void main(String[] args) 
	{
		Oppo obj1=new Oppo();
		Samsung obj2 =new Samsung();
		Realme obj3= new Realme();
		One_plus obj4=new One_plus();
		
		System.out.println("----------**************-----------");
		System.out.println();
		obj1.battery();
		obj1.camera();
		obj1.price();
		obj1.ram();
		System.out.println();
		System.out.println("----------**************-----------");
		System.out.println();
		obj2.battery();
		obj2.camera();
		obj2.price();
		obj2.ram();
		System.out.println();
		System.out.println("----------**************-----------");
		System.out.println();
		obj3.battery();
		obj3.camera();
		obj3.price();
		obj3.ram();
		System.out.println();
		System.out.println("----------**************-----------");
		System.out.println();
		obj4.battery();
		obj4.camera();
		obj4.price();
		obj4.ram();
		
    }

}
