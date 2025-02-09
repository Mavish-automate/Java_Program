package String.Program;

public class UpperCase 
{
	public void upper() 
	{
		String str="abcd";
		int length = str.length();
		String upperCase = str.toUpperCase();
		
		for(int i=0;i<=length-1;i++) 
		{
			if((i%2==1)) 
			{
				System.out.print(upperCase.charAt(i));
		
			}
			
			else {
				System.out.print(str.charAt(i));
			}
			
		}
		System.out.println();	
	}
	
	public void upperWord() 
	{
		String str="i am the best in the world";
		int length = str.length();
		
		String up = str.toUpperCase();
		
		for(int i=0;i<=length-1;i++) 
		{
			if(i%2==0) 
			{
				System.out.print(up.charAt(i));
			}
			
			else {
				System.out.print(str.charAt(i));
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		UpperCase up = new UpperCase();
		up.upper();
		up.upperWord();
	}

}
