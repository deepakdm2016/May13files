package genericsDemo;

public class myGenericClass<T> {
	T obj;
	myGenericClass(T obj){
		
		this.obj=obj;
	}
	
	public void displayObjectDtls()
	{
		System.out.println("Type of object is "+obj.getClass().getName());
		
	}
	
	public T getObject()
	{
		return obj;
		
	}

}
