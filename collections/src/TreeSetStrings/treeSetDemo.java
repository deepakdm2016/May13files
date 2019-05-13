package TreeSetStrings;

import java.util.Set;
import java.util.TreeSet;

public class treeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> names=new TreeSet<String>();
		
		names.add("Deepak");
		names.add("Nagesh");
		names.add("Abhi");
		names.add("Nagamma");
		
		for(String s:names)
		{
			System.out.println(s);
		}

	}

}
