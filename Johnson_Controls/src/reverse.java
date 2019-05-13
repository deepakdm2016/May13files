
public class reverse {

	public static void main(String v[])
	{
		String newe="carbon";
		
		char ab[]=newe.toCharArray();
		String resolved="";
		for (int i=ab.length-1;i>=0;i--)
		{
			System.out.println(ab[i]);
			resolved=resolved+ab[i];
		}
		System.out.println(resolved);
		
		
		
	}
}
