package String.Program;

public class Subsequence
{
public void subsequence() 
{
/*
Q).DIFFERENCE BETWEEN SUBSTRING & SUBSEQUENCE

THE ONLY DIFFERENCE IS 
--->SUBSTRING RETURN TRPE IS String
--->SUBSEQUENCE RETURN TYPE IS CharSequence
*/
	String str="    hello world     ";
	System.out.println(str);
	
	System.out.println(str.trim());
	System.out.println(str.subSequence(0, 7));
}
public static void main(String[] args) 
{
	Subsequence s = new Subsequence();
	s.subsequence();
}
}
