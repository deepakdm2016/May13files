package genericsDemo;

import java.util.ArrayList;
import java.util.List;

public class typeCastingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s=new String[10];
		s[0]="Virat";
		s[1]="Kohli";
		
		
		List l=new ArrayList();
		l.add("John");
		l.add("Muller");
		l.add(6);
		String s1=(String)l.get(0);
		String s2=(String)l.get(1);

		List<String> l2=new ArrayList<String>();
		l2.add("D");
		
	}

}
