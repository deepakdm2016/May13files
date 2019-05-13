
public class split_reverse_stringbuilder {
	
	public static void main(String v[])
	{
		String ab= "Qualitest";
		String new1=ab.substring(0, 5);
		String new2=ab.substring(5);
		
		StringBuilder rev1=new StringBuilder(new1);
		StringBuilder rev2=new StringBuilder(new2);
		
		rev1=rev1.reverse();
		rev2=rev2.reverse();
		
		System.out.println(rev1.toString()+rev2.toString());
		
		
	}

}
