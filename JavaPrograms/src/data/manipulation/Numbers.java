package data.manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Numbers 
{
int arr[]= {1,2,4,6,9,5,76,1,1,1};

public void num()
{
	Arrays.sort(arr);
	for(int i:arr)
	{
		System.out.println(i);
	}
}
public void num8()
{
	int rev=0;
	Arrays.sort(arr);
	for(int i:arr)
	{
		rev=rev+i;
		System.out.println(rev);
	}
}

public void m2() 
{
	List<Integer> al=new ArrayList<>();
	al.add(9);
	al.add(8);
	al.add(3);
	al.add(5);
	System.out.println(al);
	
	Collections.sort(al);
	System.out.println(al);
	
	
	System.out.println(Collections.min(al));
	System.out.println(Collections.max(al));
	
	System.out.println(al);


	
}

public void li() 
{
	List<Integer> numbers=new ArrayList<>();
	numbers.add(9);
	numbers.add(4);
	numbers.add(5);
	numbers.add(5);
	numbers.add(3);
	numbers.add(2);
	numbers.add(1);
	numbers.add(0);
	System.out.println("The ArrayList ");
	System.out.println(numbers);
	System.out.println();
	
	List<Integer> number=new LinkedList<>();
	number.add(9);
	number.add(4);
	number.add(5);
	number.add(5);
	number.add(3);
	number.add(2);
	number.add(1);
	number.add(0);
	
	System.out.println("The LinkedList ");
	System.out.println(number);
	System.out.println();
	
	Set<Integer> se=new HashSet<>();

	se.add(9);
	se.add(4);
	se.add(5);
	se.add(5);
	se.add(3);
	se.add(2);
	se.add(1);
	se.add(0);
	System.out.println("The HashSet ");
	System.out.println(se);
	System.out.println();
	
	Set<Integer> s=new LinkedHashSet<>();

	s.add(9);
	s.add(4);
	s.add(5);
	s.add(5);
	s.add(3);
	s.add(2);
	s.add(1);
	s.add(0);
	System.out.println("The LinkedHashSet ");
	System.out.println(s);
	System.out.println();
	
	Set<Integer> t=new TreeSet<>();

	t.add(9);
	t.add(4);
	t.add(5);
	t.add(5);
	t.add(3);
	t.add(2);
	t.add(1);
	t.add(0);
	System.out.println("The TreeSet ");
	System.out.println(t);
	System.out.println();
	
	Map<Integer, Integer> m=new HashMap<>();
	m.put(0, 1);
	m.put(1, 4);
	m.put(5, 5);
	m.put(0, 5);
	m.put(2, 5);

	
	System.out.println("The HashMap ");
	System.out.println(m);
	System.out.println();
	
	Map<Integer, Integer> hm=new LinkedHashMap<>();
	hm.put(0, 1);
	hm.put(1, 4);
	hm.put(5, 5);
	hm.put(0, 5);
	hm.put(2, 5);

	
	System.out.println("The LinkedHashMap ");
	System.out.println(hm);
	System.out.println();
	
	Map<Integer, Integer> tm=new LinkedHashMap<>();
	tm.put(0, 1);
	tm.put(1, 4);
	tm.put(5, 5);
	tm.put(0, 5);
	tm.put(2, 5);

	
	System.out.println("The TreeMap ");
	System.out.println(tm);
	System.out.println();
	
}

public void dupe() 
{
int [] arr= {3,7,5,3,9,8,9,5};

List<Integer> dupe=new ArrayList<>();
Set<Integer> unique=new HashSet<>();

for(int b:arr) 
{
	unique.add(b);
	dupe.add(b);

	
	
	
		
}
System.out.println(unique);
System.out.println(dupe);


List<Integer> dup=new ArrayList<>();
Set<Integer> uniqu=new HashSet<>();
for(int c:arr) 
{
	if(!uniqu.add(c)) 
	{
	dup.add(c);

	}
}
	System.out.println(dup);
}

public void count()
{
	
	Map<Integer, Integer> map=new HashMap<>();
	
	for(int b:arr) 
	{
		if(map.containsKey(b)) 
		{
			map.put(b,map.get(b)+1);
		}
		
		else {
			map.put(b, 1);
		}
	}
	System.out.println(map);
}

public void count_Char()
{
	
	Map<Character, Integer> map=new HashMap<>();
	String str="hi i am java";
	char[] ch = str.toCharArray();
	for(char b:ch) 
	{
		if(map.containsKey(b)) 
		{
			map.put(b,map.get(b)+1);
		}
		
		else {
			map.put(b, 1);
		}
	}
	System.out.println(map);
}

public void sorting() 
{
	List<Integer> li=new ArrayList<>();
	for(int y:arr)
	{
		li.add(y);
	}
	System.out.println(Collections.max(li));
	System.out.println(Collections.min(li));


}

public void swap_twoVariables() 
{
	int x=99;
	int y=57;
	
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("x= "+x);
	System.out.println("y= "+y);

}

public void swap_threeVariables() 
{
	int x=99;
	int y=57;
	int temp=0;
	temp=x;
	x=y;
	y=temp;
	System.out.println("x= "+x);
	System.out.println("y= "+y);

}
public static void main(String[] args) {
	Numbers e = new Numbers();
//	e.num();
//	e.m2();
//	e.li();
//	e.dupe();
//	e.count();
	e.count_Char();
//	e.sorting();
//	e.swap_twoVariables();
//	e.swap_threeVariables();
//	e.num8();
}
}
