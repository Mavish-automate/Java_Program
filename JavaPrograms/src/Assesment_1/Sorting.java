package Assesment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Sorting 
{
int [] a= {9,7,88,56,76,99,4};
int temp;
public void s() 
{
	System.out.println();
	System.out.println("Arrays.Sort method ");
	Arrays.sort(a);
	for(int b:a) {
		System.out.print(b+" ");
	}
//	List<Integer> st=new ArrayList<>();
//	for(int f:a) 
//	{
//		
//		Arrays.sort(a);
//		System.out.print(f+"  ");
//		}
//	}
	System.out.println();
	System.out.println("The Descending Order Of Array Of Elements");
	for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) 
		{
			if(a[i]<a[j]) 
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
			
		
		}
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("The Ascending Order Of Array Of Elements");
	for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) 
		{
			if(a[i]>a[j]) 
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
			
		
		}
		System.out.print(a[i]+" ");
	}
}


public static void main(String[] args) {
	
	Sorting e = new Sorting();
	e.s();
}
}
