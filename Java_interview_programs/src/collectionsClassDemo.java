import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class collectionsClassDemo {

	public static void main(String v[])
	{
		List<Integer> li=new ArrayList<>();
		li.add(65);
		li.add(56);
		li.add(45);
		li.add(22);
		li.add(15);
		
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);

		
		Collections.sort(li);
		System.out.println(li);
		
		int binarySearch = Collections.binarySearch(li, 22);
		System.out.println(binarySearch);
		
		
		int[] ab=new int[50];
		for(int i=0;i<ab.length;i++)
		{
			ab[i]=new Random().nextInt(50);
		}
		
		for(int i=0;i<ab.length;i++)
		{
		System.out.print(ab[i]+" ");
		}
		
		
		System.out.println("After sort");
		Arrays.sort(ab);
		for(int i=0;i<ab.length;i++)
		{
		System.out.print(ab[i]+" ");
		}
	}
	
}
