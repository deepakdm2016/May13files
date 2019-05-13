/* design bulk loading
 * 50% male, 50% female
 * 10,20,70 department
 * 20,30,50 city
 * 
 */

/*queries 3 tables
 * joins
 * groups
 * having
 * select
 */
public class charcters {
	
	public static void main(String v[])
	{
		String input="cghdfkhhd";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			output=output+input.charAt(i);
		}
		
		System.out.println(output);
	}

}
