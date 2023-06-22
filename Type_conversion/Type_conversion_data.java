package Type_conversion;

public class Type_conversion_data
{
	
public static void main(String[] args) 
{
	float a=257.0f;
	int b= (int )a;// at this point you lose some data when you convert float to integer
	int c=30;
	long f= c ;//implicit (target type must be larger)
	float d = (float)c;
	System.out.println(b);
	System.out.println(d);
                           //you can not convert boolean value to the any data type 
}
}
