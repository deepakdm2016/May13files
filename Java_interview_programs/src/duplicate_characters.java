import java.util.Map;

public class duplicate_characters {

	public static void main(String v[])
	{
		
		String a="DeepakDM";
		char ab[]=a.toCharArray();

		for(int i=0;i<ab.length;i++)
		{
			for(int j=i+1;j<ab.length;j++)
			{
				if (ab[i]==ab[j])
				{
					System.out.println(ab[i]+" is repeated");
					break;
				}
			}
			
		}
	}
}

