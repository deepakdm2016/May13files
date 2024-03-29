package setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set is a collection interface where duplicates are not allowed
 * implemented by hash set, extended by sorted set extended by navigable set
 * implemented by sorted set
 */

public class differentSets {

	public static void main(String v[]) {
		Random obj = new Random();
		Set<Integer> l1 = new HashSet<Integer>();

		for (int i = 0; i < 5; i++) {
			Integer r1 = obj.nextInt(60);
			System.out.println(r1);
			l1.add(r1);
		}
		
		System.out.println(l1);

		//Linked Hash set
		Set<Integer> l4 = new LinkedHashSet<Integer>();

		for (int i = 0; i < 5; i++) {
			Integer r1 = obj.nextInt(60);
			System.out.println(r1);
			l4.add(r1);
		}
		
		System.out.println(l4);

		//Tree set
				Set<Integer> l5 = new TreeSet<Integer>();

				for (int i = 0; i < 5; i++) {
					Integer r1 = obj.nextInt(60);
					System.out.println(r1);
					l5.add(r1);
				}
				
				System.out.println(l5);

		
	}

}
