package Assesment_1;

public class String_regex 
{
String str="maHAe09hs@7678%hjkhj$ hi i am selenium with java";
String str1="   hi    i   am   java     ";
String str2="";
public void st() 
{
	String[] split = str.split("[^a]");
	for(String s:split) {
		
		System.out.print(s);
	}
}

public void leadlag() {
	str1.trim();
	System.out.println(	str1.trim());
}

public void replace()
{
	char[] arr= {'a','c','f','m'};
	String string = arr.toString();
	for(char s:arr) 
	{
		System.out.print(s);
	}
}

public void findalpha() 
{
	String str="java Programming";
	int l = str.length();
	System.out.println(l);
	
	for(int i=0;i<=l-1;i++) 
	{
		if(str.charAt(i)=='m') 
		{
			System.out.println(str.charAt(i));
		}
	}
}

public void startEnd() 
{
	String str="Java Programming";
	String str1="TProgram";
	
//	if(str.startsWith("p")) 
//	{
//		System.out.println("pass--case--1");
//	}
	
	
	if(str1.endsWith("m"))
	{
		
		System.out.println(str1);
		
	}
	else {
		System.out.println("failed");
	}
	}

public void compare()
{
	String str1="java";
	String str2=new String("javaT");
	
	int comp = str2.compareTo(str1);
	System.out.println(comp);
}


public static void main(String[] args) {

	
	String_regex e = new String_regex();
	e.st();
	e.leadlag();
	e.replace();
	e.replace();
	e.findalpha();
	e.startEnd();
	e.compare();
	
	
	
	
}
}
