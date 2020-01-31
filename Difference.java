package Array;
/*17. Write a Java program to get the difference between the largest and 
smallest values in an array of integers. The length of the array must be 
1 and above
*/
public class Difference
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,4,5,9,4};
		int min=a[0],max=a[0];
		System.out.print("Array is :");
		for(int x:a)
		{
			System.out.print("|"+x+" ");
		}
		System.out.print("|");
		
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("\nLargest Number of an Array is: "+max);
		System.out.println("Smallest Number of an Array is: "+min);
		System.out.println("Difference between Largest and Smallest Number:\n"+(max-min));
	}

}
