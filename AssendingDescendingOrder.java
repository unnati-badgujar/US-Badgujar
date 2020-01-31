package Array;
import java.util.Scanner;
//Program for demo of assending and Descending Array list content.

public class AssendingDescendingOrder 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array Element"+size);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array is: ");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		//Ascending Array list is
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nAscending Array list is: ");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		//Descending Array list is
		int temp1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nDescending Array list is: ");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}

}
