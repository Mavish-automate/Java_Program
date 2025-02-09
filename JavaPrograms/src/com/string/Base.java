package com.string;

public class Base 
{

	public void cal() 
	{
		String str="njvjhf556e2348u";
		
		 int sum = 0;
		    for(int i=0; i<str.length(); i++){              
		            if(Character.isDigit(str.charAt(i))){
		                    sum+=str.charAt(i);
		                }
		        }
		    System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		Base n = new Base();
n.cal();
	}
	
}
