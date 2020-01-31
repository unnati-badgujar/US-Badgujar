package Array;
//10. WAP to put even and odd elements of array in two separate arrays.
public class SeperateEvenNOdd 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,4,5,6};
		int j=0,k=0,count1=0,count2=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				count1++;
			}
		}
		System.out.println(count1);
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				count2++;
			}
		}
		System.out.println(count2);
		
		int even[] = new int[count1];
		int odd[] = new int[count2];
		
		System.out.println("Even Number :");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				even[j]=a[i];
				j++;
			}
		}
		for(int x:even)
		{
			System.out.print(x);
		}
		
		System.out.println("\nOdd Number : ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				odd[k]=a[i];
				k++;
			}
		}
		for(int y:odd)
		{
			System.out.print(y);
		}
	}

}
