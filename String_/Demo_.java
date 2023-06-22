package String_;

public class Demo_ {
	
	public static void main(String[] args)
	{
		//passing value to the constructor
		String sc = new String("gaurv sapkal");//using new keyword
	
	    String sc2="hello words";//using string literals
	    
	   
	    System.out.println(sc.length());
	    System.out.println(sc2.length());//Length() gives length of string 
	    System.out.println(sc2.charAt(3));
	    if(sc2.contains("hello"))// contains() help you find the word 
	    {
	    	System.out.println("yes its contain");
	    	
	    }
	    else
	    {
	    	System.out.println("Its not contain");
	    }
	    System.out.println(sc2.substring(1,4));// substring() Give you substring
	    System.out.println(sc2.isEmpty()); // isEmpty() gives  boolean value true or false
	    System.out.println(sc2.concat("how are you"));// Concat() gives concatenate value
	}

}
