package Array;
//12. WAP to find the second smallest element in an array.
public class  SecondSmallest
{
	public static void main(String[] args) 
	{
		int a[]={1,9,3,2};  
		int temp; 
			for (int i = 0; i < a.length; i++)   
			{  
				for (int j = i + 1; j < a.length; j++)   
			    {  
					if (a[i] > a[j])   
			        {  
						temp = a[i];  
			            a[i] = a[j];  
			            a[j] = temp;  
			         }  
			    }  
		    }
			System.out.println("Sorted Array: ");
			for(int x:a)
			{
				System.out.print(x+" ");
			}
			System.out.println("\nSecond smallest: "+a[1]);  
		}
}
