package data.manipulation;

public class Dummy
{
int a;
String name;
//default Constructor
	Dummy()
	{
		System.out.println(a);
	}
	
//	Parameterized Constructor
	Dummy(int c)
	{
		this.a=c;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		Dummy e = new Dummy();
		Dummy t=new Dummy(7);
	}
}
