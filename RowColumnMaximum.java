package Array;
/*
22. WAP to print maximum in row wise in 2D array. Means e.g. arr[][] = 
{{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.
*/
public class RowColumnMaximum
{
	public static void main(String[] args) 
	{
		int a[][]=new int [][]{	{22,11, 31}, 
					{12,43, 25},{55,22,11}
				};
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println("\n---------------------");
		System.out.println("Column Wise Minimum");
		for(int i=0;i<a.length;i++)
		{
			int min=a[0][i];
			for(int j=0;j<a.length;j++)
			{
				if(a[j][i]<min)
				{
					min=a[j][i];
				}
			}
		System.out.print(""+min+" ");
		}
		System.out.println("\n---------------------");
		System.out.println("\nColumn Wise Maximum");
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i];
			for(int j=0;j<a.length;j++)
			{
				if(a[j][i]>max)
				{
					max=a[j][i];
				}
			}
		System.out.print(""+max+" ");
		}
		System.out.println("\n---------------------");
		System.out.println("\nRow Wise Minimun");
		for(int i=0;i<a.length;i++)
		{
			int min=a[i][0];
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		System.out.print(""+min+" ");
		}
		System.out.println("\n---------------------");
		System.out.println("\nRow Wise Maximum");
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i];
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		System.out.print(""+max+" ");
		}
		
		System.out.println("\n---------------------");
	}
}
