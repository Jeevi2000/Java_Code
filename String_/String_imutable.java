package String_;

public class String_imutable 
{
public static void main(String[] args) 
{
	String a="hello";// a and b give same memory but both can access single data
	String b="hello";
	String c=new String("hello");//its have same value as a and b but its stored in new location
	
	System.out.println();
	System.out.println("--------------using literal string---------------");
	System.out.println();
	if(a==b) 

	{
		System.out.println(" both string are same");
	}
	else
	{
		System.out.println(" both string are not same");
	}
	System.out.println();
	System.out.println("--------------using new keyword string---------------");
	System.out.println();
	if(a==c) // value same but object is stored different location

	{
		System.out.println(" both string are same");
	}
	else
	{
		System.out.println(" both string are not same");
	}
	
	//String pool is java heap memory where string literals are stored,
	//its privately maintained by the java string class

	
}
	
}
