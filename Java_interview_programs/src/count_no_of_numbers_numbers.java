import java.util.HashMap;

public class count_no_of_numbers_numbers {

	public static void main(String v[])
	{
		String test="Deepak is a very bad boy without ethics. Deepak please take care of yourself";
		
		String[] a=test.split(" ");
		System.out.println(a.length);
		HashMap<String,Integer> tata=new HashMap<String, Integer>();
		
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		
		for (int i=0;i<a.length;i++)
		{
			if(!tata.containsKey(a[i]))
			{
				tata.put(a[i], 1);
			}
			else
			{
				int count=tata.get(a[i]);
				tata.put(a[i], ((tata.get(a[i]))+1));
			}
		
		}
		
		System.out.println(tata);
	}
}
