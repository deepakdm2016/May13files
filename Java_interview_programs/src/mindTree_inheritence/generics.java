package mindTree_inheritence;

public class generics<T> {
	
	T obj;
	
	generics(T obj)
	{
		this.obj=obj;
	}
	
	public T getObject()
	{
		return this.obj;
		
	}
}
