import java.util.HashMap;

public class count_no_of_words_string {

	public static void main(String v[])
	{
		int a[]={1,2, 3, 2, 2, 5, 5, 8, 3, 1};
		
		HashMap<Integer,Integer> tata=new HashMap<Integer, Integer>();
		
		
		
		
		for (int i=0;i<a.length;i++)
		{
			if(!tata.containsKey(a[i]))
			{
				tata.put(a[i], 1);
			}
			else
			{
				int count=tata.get(a[i]);
				tata.put(a[i], count+1);
			}
		
		}
		
		System.out.println(tata);
	}
}
