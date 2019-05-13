package method_ReferencingThroughConstructor;

public class myClass {
	
	private String s="Soma";
	
	myClass()
	{
		
		this.s=s;
		System.out.println("Inside constructor "+this.s);
	}
	

}
