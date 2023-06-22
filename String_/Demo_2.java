package String_;

public class Demo_2 
{
	public static void main(String[] args)
	{
		String str=new String(" hello Word ");
		String str2=new String("how are you");
		// equals() check string equals or not and its case sensitive
		System.out.println(str.equals(str2));
		// equalsIgnoreCase() also check string is equals or not but its not case sensitive 
		System.out.println(str.equalsIgnoreCase(str2));
		//toLowerCase() returns all string in lower case
		System.out.println(str.toLowerCase());
		//toUpperCase() returns all string in Upper case
		System.out.println(str.toUpperCase());
		//trim() remove all spaces front and back side of string
		System.out.println(str.trim());
		//replace() method can replace one char
		System.out.println(str.replace('h','w'));
		//replaceAll() method can replace all string
		System.out.println(str.replaceAll("hello","bye"));
		// deleting space using replaceAll() method
		System.out.println(str2.replaceAll(" ",""));
		
		
		                                     
	}
}
