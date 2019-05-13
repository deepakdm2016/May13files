package methodMappingConstructors;

public class Test {

	public static void main(String[] args) {

		myInterface f1=s->new myClass(s);
		f1.get("Deepak  using lambdas");
		f1.get("Nagesh  using lambdas");
		
		
		myInterface f2=myClass::new;
		f2.get("Using constructor mapping");
	}

}
