package Array;
//Demo of How to pass array as a parameter to method in java?
public class MethodParameter 
{	
	void print(int a[])
	{
		System.out.println("Array is: ");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) 
	{
		int b[]= {4,6,7,9,2,3};
		CW2 ob=new CW2();
		ob.print(b);
	}

}
