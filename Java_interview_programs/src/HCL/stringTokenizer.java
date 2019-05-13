package HCL;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class stringTokenizer {
	
	public static void main(String v[])
	{
		String a="he is a good good boy? isn't it";
		
		a=a.replaceAll("[^A-Z a-z]", " ");
		a=a.replaceAll("  ", " ");

		String[] abc=a.split(" ");
		
		for(int i=0;i<abc.length;i++)
		{
			if(abc[i]!= " " )
			System.out.println(abc[i]);
		}
		
		
		Map<String, Integer> mp=new LinkedHashMap<String, Integer>();
		
		for(int i=0;i<abc.length;i++)
		{
			if(!mp.containsKey(abc[i]))
			{
				mp.put(abc[i], 1);
			}
			
			else
			{
				mp.put(abc[i], mp.get(abc[i])+1);
			}	
		}
		
		System.out.println(mp);
	
	}

}
