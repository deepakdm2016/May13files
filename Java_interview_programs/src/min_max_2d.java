import java.util.Arrays;

public class min_max_2d {
	
	public static void main(String v[])
	{
		int abc[][]={{8,9,7},{5,6,4},{40,9,1}};
		
		int row = 0, column=0;
		int min=abc[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(min>abc[i][j])
				{
					min=abc[i][j];
					row=i;
					column=j;
				}
			}
		}
		
		System.out.println("Minimum in given array is "+ min+" and it appears at "+(row+1)+ " th row and "+(column+1)+" th column ");
	}

}
