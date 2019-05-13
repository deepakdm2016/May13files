package Reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(2);
		l.add(9);
		l.add(5);
		l.add(50);
		
		System.out.println("Before Reversing "+l);
		Collections.reverse(l);
		System.out.println("After Reversing "+l);

	}

}
