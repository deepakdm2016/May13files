package functionInterface;

import java.util.function.Function;

public class functionTest {

	public static void main(String[] args) {

		Function<String, Integer> f=s->s.length();
		
		System.out.println(f.apply("deepak"));
		System.out.println(f.apply("Nagesh"));
		System.out.println(f.apply("Vinithra"));

	}

}
