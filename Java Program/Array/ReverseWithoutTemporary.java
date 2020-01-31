package Array;
/*WAP to reverse the array itself. {Hint- arr[] = [3, 90, 45, 29, 37, 78] 
so your same array must be [78, 37, 29, 45, 90, 3]} without using 
temporary array.  
*/
public class ReverseWithoutTemporary
{
	public static void main(String[] args) 
	{	
		int a[] = {3, 90, 45, 29, 37, 78};
		int j=a.length;
		for(int i=0;i<=a.length-1;i++)
		{
			j--;
			System.out.print(a[j]+" ");
		}
		System.out.println(a[0]);
	}

}
