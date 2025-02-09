package Arrays.Program;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort 
{

	public void ascending() 
	{
		int[] arr= {6,3,5,2,1,8};
		
	Arrays.sort(arr);
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	
	System.out.println();
	for(int a:arr) 
	{
		System.out.println(a);
	}

	}
	
	
	public void asc() 
	{
	int[] arr= {2,4,2,7,3,6,8,8,4};
	int temp=0;
	int count=0;
	for(int i=0;i<arr.length;i++) 
	{
		for(int j=i+1;j<arr.length;j++) 		
		{
			if(arr[i]==arr[j]) 
			{
//			temp=arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
			
				count++;
			
				
				
			}
			
			
		}
	
		System.out.println(+arr[i]+"----> "+count);
	}

	
	
	
	}
	
	public static void main(String[] args) 
	{
		AscendingSort a = new AscendingSort();
		a.asc();
//		a.ascending();
	}
}
