package genericsDemo;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myGenericClass<String> s=new myGenericClass<String>("Deepak");
		s.displayObjectDtls();
		System.out.println(s.getObject());
		
		myGenericClass<Integer> i1=new myGenericClass<Integer>(89);
		i1.displayObjectDtls();
		System.out.println(i1.getObject());
		
		myGenericClass<Double> d1=new myGenericClass<Double>(89.90);
		d1.displayObjectDtls();
		System.out.println(d1.getObject());
		
	}

}
