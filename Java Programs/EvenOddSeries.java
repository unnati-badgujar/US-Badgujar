package Array;
/*18. Write a Java program to separate even and odd numbers of an given
array of integers. Put all even numbers first, and then odd numbers.
*/
public class EvenOddSeries
{
	public static void main(String[] args) 
	{
		int a[] ={11,22,33,44,55,66,77,88};
		int count1=0,count2=0,j=0,k=0;
		System.out.println("Array: ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count1++;
			}
			else
				count2++;
		}
		int even[]=new int[count1];
		int odd[]=new int[count2];
		System.out.println("\nEven Numbers in array:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[j]=a[i];
				j++;
			}			
		}
		for(int x:even)
		{
			System.out.print(x+" ");
		}
		System.out.println("\nOdd Number in array:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				odd[k]=a[i];
				k++;
			}			
		}
		for(int y:odd)
		{
			System.out.print(y+" ");
		}
	}

}
