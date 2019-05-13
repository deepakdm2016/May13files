import java.util.ArrayList;

public class fibonacci {

	public static void main(String v[])
	{
		int a=0, b=1, max=10;
		ArrayList<Integer> abc=new ArrayList<>();
		
		for (int i=0;i<max;i++)
		{
			if(i==0)
			{
				abc.add(0);
			}
			else if(i==1)
			{
				abc.add(1);
				
			}
			else
				abc.add(abc.get(i-2)+abc.get(i-1));
			
			}
		System.out.println(abc);
	}
	
}
