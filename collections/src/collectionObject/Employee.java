package collectionObject;

public class Employee implements Comparable<Employee> {

	String name;
	int id;
	public Employee(String name, int id) {
	
		this.name=name;
		this.id=id;
	}
	@Override
	public int compareTo(Employee o) {
		
		if(this.id < o.id)
			return -1;
		else if(this.id < o.id) 
			return 1;
		return 0;
		
		
	}
	
	
	
	
	

}
