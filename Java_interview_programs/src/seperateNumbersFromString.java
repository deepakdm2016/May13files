
public class seperateNumbersFromString {

	public static void main(String v[])
	{
		String test="abcd123409UIh&*";
		System.out.println("By regex usage:  "+test.replaceAll("[^0-9]", ""));
		System.out.println(test.substring(0, 4));
		
		char ch[]=test.toCharArray();
		String output="";
		
		String out=test.replaceAll("[^0-9]", "");
		System.out.println("out "+ out);
		
		for(int i=0;i<test.length();i++)
		{
			
			byte temp=(byte) (ch[i]);
			
			//in bytes/int 0=48, 9=57 
			if(temp>=48 && temp<=57)
			output=output+ch[i];
		}
		System.out.println("Hi");

		System.out.println(output);
		
		Integer i=Integer.parseInt(output);
		System.out.println(i);

		
		
	}
}
