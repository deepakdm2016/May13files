import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {

	public static void main(String v[])
	{
		Set<Integer> setDemo=new TreeSet<Integer>();
		
		Random r=new Random();
		for(int i=50;i>10;i--)
		{
		//setDemo.add(r.nextInt(5));
			setDemo.add(i);
		}
		
		Iterator it=setDemo.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
	}
}
