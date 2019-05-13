import java.util.Scanner;

public class String_palindrome {

	public static void main(String v[])
	{
		System.out.println("Please enter a word or number to check if it is palindrome or not");
		Scanner s= new Scanner(System.in);
		String test=s.next();
		s.close();
		StringBuilder test_build=new StringBuilder(test);

		if (test.equalsIgnoreCase(test_build.reverse().toString()))
		{
			System.out.println("It is a palindrome");
		}
		else
			System.out.println("It is not a palindrome");
			
	}
}
