package Array;
//11. WAP to find the maximum and minimum value in an array.
public class Maximum-Minimum
{
	public static void main(String[] args) 
	{
		int a[] = {5,4,3,1,2,7};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Min"+min);
		System.out.println("Max"+max);
	}
}
 
