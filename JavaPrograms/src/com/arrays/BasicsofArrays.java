package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BasicsofArrays 
{
int [] arr= {5,3,2,7,9,8};

public void arrangeascending() 
{
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
}


public void arrangeascendingMethod2() 
{
	System.out.println();
	int[] arr= {22,13,45,63,87,99,66,1,4,2};
	int temp=0;
	int l = arr.length;
	System.out.println(l);
	
	for(int i=0;i<l-1;i++) {
		for (int j=i+1;j<l;j++)
		{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		System.out.println(arr[i]);
	}
	
}


public void arrangeascendingMethod3() 
{
	int[] arr= {22,13,45,63,87,99,66,1,4,2};
	
	int l = arr.length;
	System.out.println(l);
	
	for(int i=0;i<l-1;i++) {
		for (int j=i+1;j<l;j++)
		{
		if(arr[i]>arr[j])
		{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
		}
		}
		System.out.println(arr[i]);
	}
	
}


public void arrangeascendingMethod4() 
{
	int[] arr= {5,9,8,5,6,4,5,6};
	
	
	Map<Integer,Integer> m=new HashMap<>();

	for(int a:arr) 
	{
		if(m.containsKey(a)) 
		{
			m.put(a, m.get(a)+1);
		}
		else 
		{
			m.put(a, 1);
		}
		
		
	}
	System.out.println(m);
	}






public  void maxOrMin()
{
int n[]={1,2,3,2,5,6,3,2,1,3,2,3,3};
Map<Integer,Integer> map=new HashMap<Integer,Integer>();
for(Integer i:n)
{
if(map.containsKey(i))
{
map.put(i,map.get(i)+1);
}
else
{
map.put(i,1);
}
}
for(Map.Entry m:map.entrySet())
{
System.out.println(m.getKey()+" comes "+m.getValue()+" times.");
}
//find the max value of the map and then print the key of map
int max=Collections.max(map.values());
int min=Collections.min(map.values());
System.out.println(max);
System.out.println(min);
for(Map.Entry m:map.entrySet())
{
if(m.getValue().equals(max))
{
System.out.println(m.getKey()+" comes maximum "+m.getValue()+" times.");
}
//here we are printing which element comes max times.
if(m.getValue().equals(min))
{
System.out.println(m.getKey()+" comes minimum "+m.getValue()+" times");
}
//here we are printing which key comes minimum times.
}
}






public static void main(String[] args) {
	BasicsofArrays e = new BasicsofArrays();
	e.arrangeascending();
	e.arrangeascendingMethod2();
	e.arrangeascendingMethod3();
	e.arrangeascendingMethod4();
	e.maxOrMin();

}
	
	
	
	
	
}
