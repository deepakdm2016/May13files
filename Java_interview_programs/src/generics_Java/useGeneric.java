package generics_Java;

public class useGeneric {

	public static void main(String[] args) {

		generic<Integer> a=new generic<>(10);
		generic<String> b=new generic<>("Hello");
		
		
		System.out.println(a.getSample());
		System.out.println(b.getSample());

	}

}
