package Shape_demo;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape a=new rectangle();
		System.out.println(a.calcArea(3, 4));
		a=new triangle();
		System.out.println(a.calcArea(3, 4));

	}

}
