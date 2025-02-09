package String.Program;

import java.util.Arrays;

public class Anagram 
{
public void anagram()
{
	String str="abcd";
	String str2="dacb";
	
	int l1 = str.length();
	int l2 = str2.length();
	
	if(l1==l2) 
	{
	System.out.println("Anagram Possible");	
	}
	else 
	{
	System.out.println("Not A Anagram");	
	}
	
	char[] c1 = str.toCharArray();
	char[] c2 = str2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	if(Arrays.equals(c1,c2))
	{
	System.out.println("Anagram");	
	}
	
	else 
	{
	System.out.println("Not  A Anagram");	
	}
}

public static void main(String[] args) 
{
	Anagram ana = new Anagram();
	ana.anagram();
}
}
