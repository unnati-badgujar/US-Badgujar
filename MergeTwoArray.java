package Array;
//4. WAP to merge 2 arrays to 3rd array.
public class MergeTwoArray 
{
	public static void main(String[] args) 
	{
		int a[] = {1,5,3};
		int b[] = {4,5,6};
		int csize=a.length+b.length;
		int m=0;
		int c[] = new int[csize];
		for(int i=0;i<=a.length-1;i++)
		{
			c[m]=a[i];
			m++;
		}
		for(int i=0;i<=b.length-1;i++)
		{
			c[m]=b[i];
			m++;
		}
		System.out.println("1st Array");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println("\n2nd Array");
		for(int x:b)
		{
			System.out.print(x+" ");
		}
		System.out.println("\nMerge Array is: ");
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
