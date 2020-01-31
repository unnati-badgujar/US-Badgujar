package Array;
import java.util.Scanner;
//13. Write a Java program to test the equality of two arrays.
public class CheakEquality
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		System.out.println("Enter First Array Element= "+a.length);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Secound Array Element= "+b.length);
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("First Array:");
		for(int x:a)
		{
			System.out.print("| "+x+" ");
		}
		System.out.println("|");
		System.out.println("\nSecound Array:");
		for(int x:b)
		{
			System.out.print("| "+x+" ");
		}
		System.out.println("|");
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				flag=true;
			}
			else{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("\nArray element is Equal");
		}
		else
		{
			System.out.println("\nArray element is different");
		}
	}
}
