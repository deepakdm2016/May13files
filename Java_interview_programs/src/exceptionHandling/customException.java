package exceptionHandling;

public class customException extends Exception {

	customException(String msg)
	{
		
		super(msg);
		System.out.println("in custom Exception");
}
	
}
