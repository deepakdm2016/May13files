package Compare;

import java.util.Set;
import java.util.TreeSet;

public class sbTreeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<StringBuffer> names=new TreeSet<StringBuffer>(new sblengthComparator());
		
		names.add(new StringBuffer("Deepak"));
		names.add(new StringBuffer("Nagesh"));
		names.add(new StringBuffer("Abhi"));
		names.add(new StringBuffer("Nagamma"));
		
		for(StringBuffer s:names)
		{
			System.out.println(s);
		}

	}

}
