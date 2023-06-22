package Hierarchical_Inharitance;

public class Test_class {
	public static void main(String[] args)
	{  
		
		System.out.println("*******Child_one method*******");
		Child_one obj=new Child_one(); 
		obj.child_one_method_one();
		obj.child_one_method_two();
		obj.child_one_method_three();
		obj.child_one_method_four();
		System.out.println();
		System.out.println();//for next line
		
		System.out.println("*******Child_one method from parents class*******");
		
		Child_one.open_browser();
	    Child_one.Enter_a_Login_detail();//static method
	    obj.view_product();//Non static
		obj.flipkart();
		System.out.println();
		System.out.println();// for next line
		
		System.out.println("*******Child_two method*******");
		Child_two obj2=new Child_two();
		obj2.child_two_method_one();
		obj2.child_two_method_two();
		obj2.child_two_method_three();
		obj2.child_two_method_four();
		System.out.println();
		System.out.println();// for next line
		 
		
		System.out.println("*******Child_two method from parents class*******");
	
		Child_two.Enter_a_Login_detail();//Static method
		Child_two.open_browser();
		
		obj2.view_product();
		obj2.flipkart();// Non static method
		System.out.println();
		System.out.println();// for next line
		
		
		System.out.println("*******Child_three method*******");
		Child_three obj3=new Child_three();
		obj3.child_Three_method_one();
		obj3.child_Three_method_two();
		obj3.child_Three_method_three();
		obj3.child_Three_method_four();
		
		
		System.out.println("*******Child_three method from parents class*******");
	    
		Child_three.Enter_a_Login_detail();//static
		Child_three.open_browser();
		obj3.view_product();//Non Static
		obj3.flipkart();
		System.out.println();
		System.out.println();//for next line
		
		
		
		
		
		
		
		
	}

}
