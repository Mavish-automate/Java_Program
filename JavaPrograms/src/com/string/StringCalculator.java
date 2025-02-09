package com.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCalculator 
{


public void longestShortestWord() 
{
	String str="i am vishal";
	String[] split = str.split(" ");
	for(String s:split) 
	{
		int l = s.length();
		System.out.println(s+"----->  "+l);
		
		
	}
	System.out.println("------------");
	Arrays.sort(split);
	
	for(String j:split) 
	{
		System.out.println(j+"="+j.length());
	}
	
}

public static void main(String[] args) {
	StringCalculator e = new StringCalculator();
	e.longestShortestWord();
}

}
