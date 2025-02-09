package Swap_Numbers;

public class SwapTwoVariables 
{
int a=10;
int b=5;
int c;


public void swap() 
{
	System.out.println(a+" is value of a before swap");
	System.out.println(b+" is value of b before swap");

	c=a;
	a=b;
	b=c;
	System.out.println();
	System.out.println(a+" is value of a after swap");
	System.out.println(b+" is value of a after swap");
}

public static void main(String[] args) {
	
	SwapTwoVariables n = new SwapTwoVariables();
	n.swap();
}
}
