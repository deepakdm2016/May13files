import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class maxOccuranceCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Hello";

		Map<String, Integer> b=new HashMap<String, Integer>();
		
		for(int i=0;i<a.length();i++)
		{
			
			
			if(!b.containsKey(a.substring(i,i+1)))
			{
				System.out.println("I Am "+ a.charAt(i) );
				b.put(a.substring(i, i+1), 1);
			}
			else
			{
				System.out.println("I am here");
				int count=b.get(a.substring(i, i+1));
				count++;
				b.put(a.substring(i, i+1),count);
				
				
			}
		}
		Set s=b.entrySet();
		Iterator its=s.iterator();
		while(its.hasNext())
		{
			Map.Entry<String, Integer> output=(Map.Entry<String, Integer>) its.next();
			System.out.println(output.getKey());
			System.out.println(output.getValue());

		}
	}

}
