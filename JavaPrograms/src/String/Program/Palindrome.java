package String.Program;

public class Palindrome 
{
public void palindrome() 
{
	String str="madam";
	String rev="";
	
	int length = str.length();
	
	for(int i=length-1;i>=0;i--) 
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	
	if(rev.equals(str))
	{
		System.out.println("Palindrome");
	}
	else{
		System.out.println("Not A Palindrome");
		
	}
}
public static void main(String[] args) 
{
	Palindrome pal = new Palindrome();
	pal.palindrome();
}
}
