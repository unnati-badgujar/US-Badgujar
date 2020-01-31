package Array;
import java.util.Scanner;
//19. WAP to accept data in 2D array and print the data.
public class DemoTwoDArray 
{
	public static void main(String[] args) 
	{
		int a[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 element to print matrix :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
