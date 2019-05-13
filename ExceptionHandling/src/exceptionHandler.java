import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		boolean x = false;

		do {
			try {
				a = scan.nextInt();
				b = scan.nextInt();
				x = true;
			} catch (InputMismatchException e) {

				System.out.println("Please enter two numbers");
				scan = new Scanner(System.in);

			}
		} while (x != true);

		double c = 0;
		try {
			c = (a / b);

		} catch (ArithmeticException ae) {
			System.out.println("0/0 is not allowed");
		}
		finally{
			System.out.println("0/0 - do whatever you want");
		}
		System.out.println(c);
		
		
		int arrayy[]=new int[]{1,2,3};

		exceptionHandler exc;
		try {
			throw new customException("go to hell");
		} catch (customException e) {
			// TODO Auto-generated catch block
			System.out.println("Custom Exception occured. Handling because it's a checked exception");
		}
	}

}

