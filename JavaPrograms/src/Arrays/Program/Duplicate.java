package Arrays.Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate 
{
public void dupe()
{
	int []a= {1,2,3,4,1,4};
	
	List<Integer> dupe=new ArrayList<>();
	Set<Integer> unique=new HashSet<>();
	
	for(int b:a) 
	{
		if(dupe.add(b)) 
			
		{
			unique.add(b);
		}
			
	}
	
	System.out.println(unique);
	
	
}
public static void main(String[] args) 
{
	Duplicate dup = new Duplicate();
	dup.dupe();
}
}
