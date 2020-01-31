package Array;

public class NveAndPve 
{
	public static void main(String[] args) 
	{
		int a[]=new int[]{1,-2,5,-1,3};
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				if(i!=j)
				{
					a[i]=a[j];
				}
				j++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
