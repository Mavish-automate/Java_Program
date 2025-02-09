package String.Program;

public class Substring 
{
public void sub()
{
	
/*	SunString has 2 methods
 	Thus it is METHOD OVERLOADING
 
 */
	
	String str="hello moto";
	int length = str.length();
	
	System.out.println("SubString(int beginindex");
	for(int i=0;i<length;i++) 
	{
		System.out.println(str.substring(i));
	}
	

	System.out.println("SubString(int beginindex,int endindex");
	for(int i=0;i<length;i++) 
	{
		System.out.println(str.substring(i,length));
	}
}

public static void main(String[] args) 
{
	Substring s = new Substring();
	s.sub();
}
}
