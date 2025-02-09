package String.Program;

public class StringSplit 
{
public void split() 
{
	String str="hello @ World";
	String[] split = str.split("@");
	for(String o:split) {
		System.out.println(o);
	}
	
	String s="i am the A the resto";
	String[] split2 = s.split("[a-h]", 3);
	for(String o:split2) {
		System.out.println(o);
	}
	
}
public static void main(String[] args)
{
	StringSplit s = new StringSplit();
	s.split();
}
}
