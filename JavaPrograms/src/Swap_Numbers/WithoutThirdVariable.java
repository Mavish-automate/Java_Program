package Swap_Numbers;

public class WithoutThirdVariable 
{
int a =10;
int b=5;

public void swap() 
{
	
	System.out.println("before swap");
	System.out.println(a);
	System.out.println(b);
	
	a=a-b;
	b=a+b;
	a=b-a;
	
	System.out.println("after swap");
	System.out.println(a);
	System.out.println(b);
	
}

public static void main(String[] args) 
{
	WithoutThirdVariable e = new WithoutThirdVariable();
	e.swap();
}
}
