package ocjp;

public class exceptionDemo {

	public static Exception method1()
	{
		return new Exception();
		
	}
	
	public static void main(String v[]) throws Exception
	{
		throw method1();
		
	}
}

//throwable class implements serializable interface and extends object class.
//throwable -> Exception -> RunTimeException