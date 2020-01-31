package Array;
import java.util.Scanner;
//1. WAP to create 1D array and accept data in that array. Calculate the average value of array 
//elements.
public class AverageValue 
{
	public static void main(String[] args) 
	{
		int add=0;
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
		// Average logic
		double avg=0;
		for(int j=0;j<size;j++)
		{
			add=add+a[j];
		}
		avg= add/size;
		System.out.println("\nAvg"+avg);
	}

}
