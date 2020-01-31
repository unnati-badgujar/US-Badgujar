package Array;
//9. Write a Java program to find sum of elements of an array.
public class SumOfElement 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4};
		int sum=0;
		System.out.println("Sum of All Array Element: ");
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.print(sum);
	}
}
