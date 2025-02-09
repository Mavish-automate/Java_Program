package Arrays.Program;

import java.util.HashMap;
import java.util.Map;

public class Counts 
{
public void cnt() 
{
	int []a= {99,98,99,57,23,65,47,57};
	
	Map<Integer,Integer> cont=new HashMap<>();
	
	for(int b:a) 
	{
		if(cont.containsKey(b)) 
		{
			cont.put(b,cont.get(b)+1);
		}
		
		else {
			cont.put(b, 1);
		}
	}
	System.out.println(cont);
}
public static void main(String[] args) 
{
	Counts c = new Counts();
	c.cnt();
}
}
