package HCL;

public class mainShape {

	public static void main(String v[])
	{
		shape A=new circle(10);
		
		System.out.println("Area of cirle "+A.Area(A.getLength()));
		
		shape AB=new recatangle(2,5);
		
		System.out.println("Area of rectangle "+AB.Area(AB.getLength(),AB.getBreadth()));

	}
}
