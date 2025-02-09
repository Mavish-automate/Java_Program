package com.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicOfString 
{

String str="mahevish@94";

public void regrlarExpression()
{
	String[] a = str.split("[0-9]");
	System.out.println("(1). Using [0-9]");
	for(String A:a)
	{
		System.out.println(A);
	}
	
	
	
	String[] b = str.split("[ae]");
	System.out.println("(2). Using [ae]");
	for(String B:b)
	{
		System.out.println(B);
	}
	
	
	String[] c = str.split("[^maha]");
	System.out.println("(3). Using [^ma]");
	for(String C:c)
	{
		System.out.println(C);
	}
	String[] d = str.split("[a-e]");
	

}

public void palindrome() 
{
	
	String str="nitin";
	String rev="";
			
	int l = str.length();
	for(int i=l-1;i>=0;i--) 
	{
	rev =rev+ str.charAt(i);	
	}
	if (str.equals(rev))
	{
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not A Palindrome");
	}
	
}
	
public void anagram() 
	{
		String str="Anagram";
		String str2="gramana";
		
		char[] ch = str.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch,ch2))
		{
		System.out.println("Anagram");	
		}
		
		else 
		{
		System.out.println("Not  A Anagram");	
		}

	}

public void uooerCase()
{
	String str="hero or zero";
	
	
	String[] split = str.split("\s");
	for(String s:split) {
		String up = s.substring(0,1).toUpperCase()+s.substring(1);
		System.out.println(up);
	}
	
	
	}


public void sub() {
	String str="i am java with selenium";
	
	System.out.println(str.substring(2));
	System.out.println(str.substring(2, 8));
	System.out.println(str.concat(" checked in"));
}

public void regex() 
{
	
}
	
	


public static void main(String[] args) 
{
	BasicOfString e = new BasicOfString();
//	e.regrlarExpression();
//	e.palindrome();
//	e.anagram();
//	e.uooerCase();
	e.sub();
}
}
