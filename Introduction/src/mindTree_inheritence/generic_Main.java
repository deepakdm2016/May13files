package mindTree_inheritence;

public class generic_Main {

	public static void main(String[] args) {

		generics<String> g1=new generics <String> ("hello");
		generics<Integer> g2=new generics <Integer> (1232);
		
		System.out.println(g1.getObject());
		System.out.println(g2.getObject());
	}

}
