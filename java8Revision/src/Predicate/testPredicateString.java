package Predicate;

import java.util.function.Predicate;

public class testPredicateString {
	
	public static void main(String v[])
	{
	
	Predicate<String> p=s->s.length()>5;
	System.out.println(p.test("Deepak"));
	p.test("Hell");
	p.test("India");
		
	}

}
