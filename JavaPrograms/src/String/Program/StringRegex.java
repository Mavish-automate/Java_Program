package String.Program;

public class StringRegex 
{
/*
 REGEX PATTERN:
 --->Pattern used for TEXT SEARCH or TEXT REPLACEMENT
 
 --->Expression	Description
	[abc]	Find one character from the options between the brackets
	[^abc]	Find one character NOT between the brackets
	[0-9]	Find one character from the range 0 to 9
	
--->Java does not have a built-in Regular Expression class, but we 
can import the java.util.regex package to work with regular expressions

--->METHOD OVERLOADING
	a).String replace(char old, char new):
	Replaces a char from string
	
	b).String replace(CharSequence target, CharSequence replacement):
	Replaces  sequence of character from  a String
	
--->ReplaceAll:
			follows regex pattern as a target string and replaces it a string 
			replaces all the occurrences of a single word or set of words
			
			String s1="My name is Khan. My name is Bob. My name is Sonoo.";  
String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"  
System.out.println(replaceString);  

*/
	
	public void textReplace() 
	{
		String str="java sTring performs search operation 123 sd 12";
		
		
		String r1 = str.replace('a', 'b');
		System.out.println(r1);
		
		System.out.println(str.replace("av", "z"));
		
	System.out.println(str.replaceAll("[a-j 0-9]", " "));//--->finds the string  in regex and then replaces
		System.out.println(str.replaceAll("[^a-j 0-9]", "sdfdf"));//--->finds the Syting between Regex
		
		System.out.println(str.replaceAll("\\s", "asd"));//-->removes space in between words

	}
	public static void main(String[] args)
	{
		StringRegex s = new StringRegex();
		s.textReplace();
		
	}
}
