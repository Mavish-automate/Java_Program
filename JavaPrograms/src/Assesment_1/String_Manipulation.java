package Assesment_1;

public class String_Manipulation
{
String str=" hi i am selenium with java      ";

public void whiteSpace() 
{
	String trim = str.trim();
	System.out.println(trim);
	
	System.out.println();
	System.out.println();
	
	String[] split = str.split("\s");
	for(String s:split) 
	{
		System.out.println(s);
	}
	System.out.println();
	System.out.println();
	
	for(int i=0;i<=str.length()-1;i++) 
	{
		if(i%2==0) {
			System.out.print(str.toUpperCase().charAt(i));
		}
		else {
			System.out.print(str.toLowerCase().charAt(i));
		}
	}
}

public static void main(String[] args) {
	String_Manipulation e = new String_Manipulation();
	e.whiteSpace();
}
}
