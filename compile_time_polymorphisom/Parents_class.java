package compile_time_polymorphisom;

public class Parents_class {

	
		
		public static void main(String[] args)
		{
			Parents_class obg=new Parents_class();
			obg.add(23, 34);
			obg.add("name",68);
		}
		public  void add(int a, int b)
		{
			System.out.println(a+b);
		}
		public static void add(String c,int d)
	
		{
			System.out.println(c+" "+d);
		}
}
