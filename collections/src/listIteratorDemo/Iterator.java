package listIteratorDemo;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Iterator {

	public static void main(String v[]) {

		Set<Integer> l = new TreeSet<Integer>();
		Random obj = new Random();

		for (int i = 0; i < 55; i++) {
			Integer r1 = obj.nextInt(60);
			System.out.println(r1);
			l.add(r1);
		}
		
		java.util.Iterator<Integer> iterator = l.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
