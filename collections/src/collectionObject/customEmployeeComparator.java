package collectionObject;

import java.util.Comparator;

public class customEmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		String s1=e1.name;
		String s2=e2.name;
		return(s1.compareTo(s2));
	}

}
