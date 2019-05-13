package Compare;

import java.util.Comparator;

public class sblengthComparator implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		// TODO Auto-generated method stub

		if(o1.length()<o2.length())
		{
			return -1;
		}
		
		
		else if(o1.length()>o2.length())
		{
			return 1;
		}
		
		else
		return o1.toString().compareTo(o2.toString());
		
	}
	

}
