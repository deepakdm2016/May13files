import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class anagram {
	
	@Test
	public  void checkanagram() throws IOException
	{
		
		String a="liseun";
		
		System.out.println("Enter second string");
		String b="netsil";
		
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		
	
		char[] ab=a.toCharArray();
		Arrays.sort(ab);
		
		char[] bc=b.toCharArray();
		Arrays.sort(bc);
		
		String new3=new String(ab);
		String new4=new String(bc);
		
		System.out.println(new3+" "+new4);
		for(int i=0;i<ab.length;i++)
		{
			for(int j=i+1;j<ab.length;j++)
			{
				if(ab[i]>ab[j])
				{
					char temp=ab[j];
					ab[j]=ab[i];
					ab[i]=temp;
				}
				
			}
		}
		
		
		for(int i=0;i<bc.length;i++)
		{
			for(int j=i+1;j<bc.length;j++)
			{
				if(bc[i]>bc[j])
				{
					char temp=bc[j];
					bc[j]=bc[i];
					bc[i]=temp;
				}
				
			}
		}
		
		
		String new1=new String(ab);
		String new2=new String(bc);
		
		Assert.assertEquals(new1, new2);
		
		if(new1.equalsIgnoreCase(new2))
		{
			
			System.out.println(new1);
			System.out.println(new2);

			System.out.println("It is a anagram");
		}
		else
		{
			System.out.println(new1);
			System.out.println(new2);

			System.out.println("It is not a anagram");
			
		}
		
		}
	}


