import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class No_of_words_in_sentence {

	public static void main(String v[])
	{
		String test="Hello God thanks God for the rebirth and allowing me to work again";
		
		String b[]=test.split(" ");
		
		Map<String, Integer> mapp=new HashMap<String, Integer>();
		for(int i=0;i<b.length;i++)
			{
				
				if(mapp.containsKey(b[i]))
				{
					int c=mapp.get(b[i]);
					mapp.put(b[i], ++c);
				}
				else
					mapp.put(b[i], 1);
			
			
			}
		
		System.out.println(mapp);
		Set s=mapp.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey()+" "+ mp.getValue());
			
		}
	}
}
