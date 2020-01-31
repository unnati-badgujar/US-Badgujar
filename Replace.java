package Array;
/*16. WAP to replace all the 0’s with 1’s in your array.
Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34].
*/
public class Replace
{
	public static void main(String[] args) 
	{
		int a[] = {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		int j=1;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==0)
			{
				a[i]=j;
			}
		}
		System.out.println("New Array 0's replace with 1's: \n");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}

}
