package java8;

public class firstLambda{

	public static void main(String[] args) {
		
		A a =()-> System.out.println("Evaluating my first Lambda function");
		a.myMethod();

	}


}
