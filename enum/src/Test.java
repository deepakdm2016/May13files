
public class Test {
	
	public static void main(String v[])
	{
		paymentType pt=paymentType.CREDITCARD;
		System.out.println(pt);
		paymentType[] values = paymentType.values();
		for(paymentType pt1:values)
		{
			System.out.println(pt1);
		}
		
		for(paymentType pt1:values)
		{
			System.out.println(pt1.ordinal());
		}
		
	}

}
