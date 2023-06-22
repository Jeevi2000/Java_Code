package compile_time_polymorphisom;



public class Class_class extends Parents_class {
	
	public static void main(String[] args)
	{
		Class_class obj =new Class_class();
	     obj.add("abc","cde");
	     obj.add(1, 3);
	}
	
	public void add(String c, String d)
	{
		
		System.out.println(c+" "+d);
	}

}


