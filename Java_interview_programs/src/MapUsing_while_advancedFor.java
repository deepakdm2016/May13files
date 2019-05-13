import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapUsing_while_advancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> test=new HashMap<String, String>();
		test.put("Hi", "Hello");
		test.put("Hi1", "Hello1");
		test.put("Hi2", "Hello2");
		test.put("Hi3", "Hello3");
		test.put("Hi4", "Hello4");
		
		Set s=test.entrySet();
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry ab=(Map.Entry)it.next();
			System.out.print(ab.getKey());

			System.out.println(ab.getValue());
			
		}
		
	//using for each loop with hashmap and map.entrySet(set)	
		for(Map.Entry hm:test.entrySet()  )
		{
			System.out.print(hm.getKey());

			System.out.println(hm.getValue());		}
	}

}
