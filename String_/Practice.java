package String_;

public class Practice 
{
	public static void main(String[] args) 
	{
		String s=new String("APP123LE");
		String a="";
		String b="";
		String c="";
		
		a=s.substring(0,3);
		b=s.substring(3,6);
		c=s.substring(6,8);
		a=a.concat(c);
		System.out.println(a=a.concat(b));
		
		
		
	}

}
