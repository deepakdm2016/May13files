package collectionObject;

import java.util.Set;
import java.util.TreeSet;

public class testEmployee {

	
	public static void main(String[] args) {

		Set<Employee> el=new TreeSet<Employee>();
		/*for custom comparator
		 * 		Set<Employee> el=new TreeSet<Employee>(new customEmployeeComparator());
		 */

		el.add(new Employee("Deepak",389524));
		el.add(new Employee("Nagesh",389520));
		el.add(new Employee("Vinithra",389512));
		el.add(new Employee("Ajit",389724));
		el.add(new Employee("Arul",3895));
		
		for(Employee e:el)
		{
			System.out.println(e.name);
			System.out.println(e.id);

		}

	}

}
