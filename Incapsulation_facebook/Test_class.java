package com.java.Incapsulation_facebook;

public class Test_class 
{
public static void main(String[] args) 
{
	Facebook obj=new Facebook();
	obj.setFollowers(50);
	obj.setFollowing(60);
	obj.setFriends(40);
	obj.setPost(10);
	System.out.println(obj.getFollowers());
	System.out.println(obj.getFollowing());
	System.out.println(obj.getFriends());
	System.out.println(obj.getPost());
	
	
	
	
	
}
}
