package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmaptest {
	
	public static void main(String v[])
	{
		Map<String, Integer> mp=new LinkedHashMap<>();
		mp.put("Deepak", 80);
		mp.put("Vinithra", 95);
		mp.put("Nagesh", 85);
		mp.put("bryan", 65);

		Set<Entry<String, Integer>> entrySet = mp.entrySet();	
		for(Map.Entry<String, Integer> test:entrySet)
		{
			System.out.println(test.getKey());
			System.out.println(test.getValue());
			
			
		}
		
		Set<String> keySet = mp.keySet();
		System.out.println("Keys "+ keySet);
		

		Collection<Integer> values = mp.values();
		System.out.println("values "+ values);

		for (String k: keySet)
		{
			System.out.println("For Key "+k+" value is "+ mp.get(k));
		}
		
	}

}
