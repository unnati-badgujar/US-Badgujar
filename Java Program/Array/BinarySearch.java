package Array;
import java.util.Scanner;

//1. Write a program to enter elements and perform binary search.
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the element ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array is:\n");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		int l=0,r=a.length-1,mid=0,key=4
				,count=0;
		while(l<=r)
		{
			mid = (l+r)/2;
			count++;
			if(a[mid]==key)
			{
				System.out.print ("Array is =");
				for(int i=0;i<=r;i++)
				{
					System.out.print(a[i]+" ");
				}
				System.out.println("\n"+key+" at position = "+mid);
				System.out.println("Key Value = "+key);
				System.out.println("Number of Comparision = "+count);
				break;
			}
			if(key>a[mid])
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}

	}

}
