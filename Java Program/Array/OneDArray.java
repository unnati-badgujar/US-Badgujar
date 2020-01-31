package Array;

import java.util.Scanner;
//2. WAP to add elements to single dimensional array  and print elements from 1D array.
public class OneDArray
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of array :");
		int size=scanner.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Element :");
		for(int i=0;i<=size-1;i++)
		{
			a[i]= scanner.nextInt();
		}
		System.out.println("Array Elements are : ");
		for(int i=0;i<=size-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}

}
