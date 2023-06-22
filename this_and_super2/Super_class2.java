package this_and_super2;

public class Super_class2 {
	 public static int r=80;
	protected static int g=70; //private and defult cant access if diff pack class
	public static void main(String[] args)
	{
		
	}

    public  void class1()
    {
    	System.out.println("im class 1 method from Superclass2 in diff. package");
    }
    public static void class2()
    {
    	System.out.println("im class 2 method from Superclass2 in diff. package");
    }
}
