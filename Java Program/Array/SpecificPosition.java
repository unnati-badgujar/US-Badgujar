package Array;
import java.util.Scanner;
//3. WAP to insert an element in a specific position into an array.
public class SpecificPosition
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
		System.out.println("\nEnter the Position");
		int pos=scanner.nextInt();
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		for(int j=0;j<size-1;j++)
		{
			if(a[j]==a[pos])
			{				
				a[pos]=num;
			}			
		}
		System.out.println("New Array is : ");
		for(int i=0;i<=size-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		scanner.close();
	}
}
