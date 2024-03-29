package listIteratorDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class liDemo {

	public static void main(String[] args) {

		List<String> l = new LinkedList<String>();
		l.add("abc");
		l.add("def");
		l.add("xyz");

		ListIterator<String> li = l.listIterator();

		System.out.println("In forward direction");

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("In reverse direction");

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
