package lambda_inbuilt;

import java.util.ArrayList;
import java.util.List;

public class testCompare {

	public static void main(String v[])
	{

	List<String> strList=new ArrayList<>();
	strList.add("Me");
	strList.add("You");
	strList.add("I");
	strList.add("woh");
	
	strList.sort(
			(s1, s2)->s1.compareTo(s2)
			
			);
	
	System.out.println(strList);
	
	
	
	}
}
