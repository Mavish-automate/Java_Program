package Assesment_1;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfInteger 
{
int[] arr= {4,6,6,4,5,9,6};

public void test() 
{
	Map<Integer, Integer> map=new HashMap<>();
	for(int a:arr) 
	{
		if(map.containsKey(a)) 
		{
			map.put(a, map.get(a)+1);
		}
		else {
			 map.put(a, 1);
		}
	}
	System.out.println(map);
}
public static void main(String[] args) {
	FrequencyOfInteger e = new FrequencyOfInteger();
	e.test();
}
}
