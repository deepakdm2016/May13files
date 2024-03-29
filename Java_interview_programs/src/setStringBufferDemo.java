import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class setStringBufferDemo {

	public static void main(String v[])
	{
		List<String> listDemo=new ArrayList<>();
		listDemo.add("xyz");
		listDemo.add("abc");
		listDemo.add("nju");
		
		System.out.println(listDemo.stream().sorted().collect(Collectors.toList()));
		
		
		List<StringBuffer> listDemo1=new ArrayList<>();
		listDemo1.add(new StringBuffer("xyz"));
		listDemo1.add(new StringBuffer("abc"));
		listDemo1.add(new StringBuffer("nju"));
		
		
		Comparator<StringBuffer> c=(s1,s2)->{
			
			return s2.toString().compareTo(s1.toString());
		};
	
		Comparator<String> c3=(a,b)->a.compareTo(b);
		
		System.out.println(listDemo1.stream().sorted(c).collect(Collectors.toList()));
		
		
		ListIterator<String> it=listDemo.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
	}
}
