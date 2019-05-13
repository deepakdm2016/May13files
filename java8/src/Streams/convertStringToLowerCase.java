package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class convertStringToLowerCase {
	
	public static void main(String v[])
	{
		List<String> l1=new ArrayList<String>();
		l1.add("Bharath");
		l1.add("ViNiThRa");
		l1.add("DEEPAK");
		System.out.println(l1);
		
		List<String> l2 = l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(l2);
	}

}
