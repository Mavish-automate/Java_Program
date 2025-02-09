package Assesment_1;

public class UpperCase_LowerCase 
{
String str="hi i am java";

public void split() 
{
	for(int i=0;i<=str.length()-1;i++) 
	{
		if((i%2)==0)
		{
			 
			 System.out.print(str.toUpperCase().charAt(i));
		}
		else {
			 System.out.print(str.toLowerCase().charAt(i));

		}
	}
	
}
	public static void main(String[] args) {
		UpperCase_LowerCase e = new UpperCase_LowerCase();
		e.split();
	}
	
}
