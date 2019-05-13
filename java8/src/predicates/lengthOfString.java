package predicates;

import java.util.function.Predicate;

public class lengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> p= s->(s.length()>5);
		
		Predicate<Integer> p3= i -> i%2==0;
		
		p3.test(9);
		
		
		System.out.println(p.test("Deepak"));
		
		System.out.println(p.test("Ind"));
				
		System.out.println(p.test("Vini"));

	}

}
