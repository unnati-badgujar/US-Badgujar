import java.util.Scanner;

/* Take 10 integer inputs from user and print the following:
number of odd numbers
*/
public class OddNumber 
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
			if(a[i]%2!=0)
			{
				System.out.println("Odd Number:: "+a[i]);
				count++;
			}
			
		}	
		
		System.out.println("No of Odd numbers : "+count);
		
		
		}

	
	}	
}
