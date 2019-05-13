package methodMapping;

public class myClass {

	public void myMethod2(int i)
	{
		System.out.println("HI "+i);
	}
	public static void main(String[] args) {

		myInterface f=i -> System.out.println(i);
		f.myMethod(10);
		
		myClass c=new myClass();
		myInterface f1=c::myMethod2;
		f1.myMethod(20);
		
		
	}

}
