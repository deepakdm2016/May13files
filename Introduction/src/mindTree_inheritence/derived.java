package mindTree_inheritence;
public class derived extends base {
	derived()
	{
		System.out.println("count3 "+count);

		addvalue(count);
	}
	private void addvalue(int i) {
		System.out.println("count4 "+count);

		count+=10;
	}
	
}
