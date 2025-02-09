package com.wrapper;

public class String_Manipulation 
{
String str="AhgBNHd4663tui(*&";
int sum;


public void s()
{
	char[] ch = str.toCharArray();
	
	for(Character c:ch) 
	{
		if(Character.isDigit(c)) 
		{
			sum+=c-'0';
		}
	}
	System.out.println(sum);
}

public void alphabets()
{
	char[] ch = str.toCharArray();
	
	for(Character c:ch) 
	{
		if(Character.isAlphabetic(c)) 
		{
			System.out.print(c+" ");		
		}
	}
	System.out.println();
}

public void a()
{
	char[] ch = str.toCharArray();
	
	for(Character c:ch) 
	{
		if(!Character.isUpperCase(c)) 
		{
			System.out.print(c+" ");		
		}
	}
	System.out.println();
	
}

public void spl()
{
	char[] ch = str.toCharArray();
	
	for(Character c:ch) 
	{
		if(!Character.isLetterOrDigit(c)) 
		{
			System.out.print(c+" ");		
		}
	}
	System.out.println();
	
}

public void l()
{
	char[] ch = str.toCharArray();
	
	for(Character c:ch) 
	{
		if(Character.isUpperCase(c)) 
		{
			System.out.print(c+" ");		
		}
	}
	System.out.println();
	
}



public static void main(String[] args) {
	String_Manipulation n = new String_Manipulation();
	n.s();
	n.alphabets();
	n.a();
	n.spl();
	n.l();
	
}
}
