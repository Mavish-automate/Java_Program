package String.Program;

public class ReverseString 
{
public void reverse() 
{
	
	
	String str="ram";
	String rev="";
	
	System.out.println(str);
	
	for(int i=str.length()-1;i>=0;i--) 
	{
		rev=rev+str.charAt(i);
		
		
	}
	System.out.println(rev);

}

public static void main(String[] args) 
{
	ReverseString rev = new ReverseString();
	rev.reverse();
}
}
