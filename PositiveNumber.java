package Array;

import java.util.Scanner;

/* Take 10 integer inputs from user and print the following:
number of positive numbers

*/
public class PositiveNumber
{		
	public static void main(String[] args) 
	{
		int a[] = new int[10],count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 10 array element :");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scanner.nextInt();
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>=0)
			{
				System.out.println("Positive  "+a[i]);
				
				count++;
			}
		}	
		
		System.out.println("No of Positive numbers : "+count);
		
		
		}

}
