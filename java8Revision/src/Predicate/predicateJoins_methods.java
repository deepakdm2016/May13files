package Predicate;

import java.util.function.Predicate;

public class predicateJoins_methods {

	public static void main(String v[]) {
		int x[] = { 1, 2, 3, 4, 5, 7, 9, 0, 6 };

		Predicate<Integer> p1 = i -> i < 5;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("Applying Predicate p1");
		predicateMethod(p1, x);
		System.out.println("Applying Predicate p2");

		predicateMethod(p2, x);
		System.out.println("Joining Predicate p1 and p2");

		predicateMethod(p1.and(p2), x);
		System.out.println("Joining Predicate p1 and p2");

		predicateMethod(p1.or(p2), x);

		System.out.println("Negation of a predicate");

		predicateMethod(p1.negate(), x);

	}

	public static void predicateMethod(Predicate p, int x[]) {
		for (int i = 0; i < x.length; i++) {
			if (p.test(x[i]))
				System.out.println(x[i]);
		}
	}

}
