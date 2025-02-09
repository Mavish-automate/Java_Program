package Swap_Numbers;

public class ThreeVariable 
{
int a=5;
int b=8;
int c=9;
int d;

public void swap() 
{

a=a+b+c;
b=a-(b+c);
c=a-(b+c);
a=a-(b+c);
	
	System.out.println("after swap");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

}

public static void main(String[] args) 
{
	ThreeVariable n = new ThreeVariable();
	n.swap();
}
}
