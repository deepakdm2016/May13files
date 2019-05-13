import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class remove_Duplicates {
	
	public static void main(String v[])
	{
		int a[]={1,2,3,4,5,1,3};
		
		Set<Integer> ab= new HashSet<Integer>();
		for(int i:a)
		{
			 ab.add(i);
		}
		
		System.out.println(ab);
	}

}
