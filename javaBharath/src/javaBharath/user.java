package javaBharath;

import java.io.Serializable;

public class user implements Serializable {
	
	String name;
	transient int id;
	
	
	
	public user(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean equals(user u)
	{
		if((u.name).equals(this.name) && u.id==this.id)
			return true;
		return false;
		
		
	}
	
	
	public String toString()
	{
		return "Name is "+this.name+ " and id is "+this.id;
		
	}
	
	

}
