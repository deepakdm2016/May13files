package method_ReferencingThroughConstructor;

public class testConsMapping {
	
	public static void main(String v[])
	{
	Runnable r= myClass::new;
	Thread a=new Thread(r);
	a.start();
	}
}
