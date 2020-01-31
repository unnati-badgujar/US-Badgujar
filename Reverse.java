package Array;
//6. WAP to print reverse of an array.
public class Reverse
{	
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4};
		int j=a.length;
		for(int i=0;i<=a.length-1;i++)
		{
			j--;
			System.out.print(a[j]+" ");
		}
	}

}
