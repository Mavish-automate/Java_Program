package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation 
{
public void hashMapMethods() 
{
	int[] arr= {22,65,45,87,78,45,65};
	int count=0;
	Map<Integer,Integer> map=new HashMap<>();
for(int i=0;i<arr.length;i++) 
{
	if(map.containsKey(arr[i]))
	{
		map.put(arr[i], map.get(arr[i])+1);
	}
	
	else 
	{
		map.put(arr[i], 1);
	}
	System.out.println(map);
}

//for(Map.Entry<Integer, Integer> entry: map.entrySet()) 
//{
//	 System.out.println(entry.getKey() + " " + entry.getValue());	
//	 
//	 if(entry.getValue()>1)
//	 {
//		 System.out.println(entry.getKey() + " is duplicated " + entry.getValue()+" times ");
//		 
//	 }
//}

}

public void method() 
{
	int[]a= {1,2,3,5};
	Map<Integer, Integer> map=new HashMap<>();
	
	for(Integer b:a) 
	{
		if(map.containsKey(a)) {
			System.out.println(map.put(b, map.get(b)));
		}
	}
	{
		
	}
}

public static void main(String[] args) 
{
	HashMapImplementation n = new HashMapImplementation();
	n.hashMapMethods();
	n.method();
	
}
}
