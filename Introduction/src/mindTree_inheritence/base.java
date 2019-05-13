package mindTree_inheritence;

public class base {
	int count=10;
	base()
	{
		addvalue(count);
		System.out.println("count "+count);
	}
	private void addvalue(int i) {
		System.out.println("count1 "+count);

		count+=10;
	}
	
}


