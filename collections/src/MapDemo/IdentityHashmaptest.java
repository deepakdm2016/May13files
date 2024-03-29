package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashmaptest {
	
	public static void main(String v[])
	{
		Map<StringBuffer, Integer> mp=new HashMap<>();
		mp.put(new StringBuffer("Deepak"), 80);
		mp.put(new StringBuffer("Deepak"), 90);
		mp.put(new StringBuffer("Vinithra"), 95);
		mp.put(new StringBuffer("Nagesh"), 85);
		mp.put(new StringBuffer("bryan"), 65);
		System.out.println(mp);
		
		Set<StringBuffer> keySet = mp.keySet();
		System.out.println("Keys "+ keySet);
		

		Collection<Integer> values = mp.values();
		System.out.println("values "+ values);

		for (StringBuffer k: keySet)
		{
			System.out.println("For Key "+k+" value is "+ mp.get(k));
		}
		
	}

}
