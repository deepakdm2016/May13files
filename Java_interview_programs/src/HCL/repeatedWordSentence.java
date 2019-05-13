package HCL;

import java.util.LinkedHashMap;
import java.util.Map;

public class repeatedWordSentence {

	public static void main(String[] args) {

		String a="He is a goodgood good good guy\nhello! thank you and \nWelcome\nbyebye bye bye";
		String output="";
		
		
		String[] abc=a.split(" ");
		
		
		
		
		Map<String, Integer> mp=new LinkedHashMap<String, Integer>();
		
		for(int i=0;i<abc.length;i++)
		{
			if(!mp.containsKey(abc[i]))
			{
				mp.put(abc[i], 1);
				output=output+" "+abc[i];
			}
			
			else
			{
				mp.put(abc[i], mp.get(abc[i])+1);
			}	
		}
		
		System.out.println(a);
		System.out.println();


		System.out.println(output.trim());
		System.out.println(mp);

		
				
				
		
	}

}
