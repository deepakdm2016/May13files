package CollectionAndArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortedList {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("D");
		l.add("K");
		l.add("C");
		
		System.out.println("Before sorting "+l);
		Collections.sort(l);
		System.out.println("After sorting "+l);
		
		
		
		Collections.sort(l, new myComparator());;
		System.out.println("After sorting with custom comparator"+l);

		Collections.sort(l);
		System.out.println("After sorting "+l);

		int binarySearch = Collections.binarySearch(l, "Z");
		System.out.println(binarySearch);
		
	}

}
