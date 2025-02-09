package Assesment_1;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter 
{
String str="maheshwari";

public void test() 
{
	char[] ch = str.toCharArray();
	Map<Character, Integer> map=new HashMap<>();
	
	for(char c:ch) 
	{
		if(map.containsKey(c)) 
		{
			map.put(c, map.get(c)+1);
		}
		else {
			map.put(c, 1);
		}
	}
	System.out.println(map);
}

public static void main(String[] args) {
	FrequencyOfCharacter e = new FrequencyOfCharacter();
	e.test();
}

}
