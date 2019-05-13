
public class split_reverse {

	public static void main(String[] args) {
		String ab="qualitest";
		String new1=ab.substring(0, 5);
		String new2=ab.substring(5);
		String reverse="";
		
		for(int i=new1.length()-1;i>=0;i--)
		{
			reverse=reverse+new1.charAt(i);
		}
		
		for(int i=new2.length()-1;i>=0;i--)
		{
			reverse=reverse+new2.charAt(i);
		}
		
		System.out.println(reverse);
		
	}

}

/* Other things asked are
1. Introduce yourself
2. h1b
3. Abstract and interface class
4. Array list and linked list
5. Selenium framework
6. TestNG annotations
7. Program described above - string builder and reverse function would have been appropriate
8. Feedback - not strong at programming
9. Parameterization
*/