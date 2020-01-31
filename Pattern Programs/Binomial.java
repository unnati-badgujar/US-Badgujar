package Pattern;
public class Binomial 
{
	public static void main(String[] args) 
	{
		
/*	      1 
	     1 1 
	    1 2 1 
	   1 3 3 1 
	  1 4 6 4 1 
*/
		int n=1,rem=0;
		for(int i=0;i<5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			int temp=n;
			while(temp>0)
			{
				rem=temp%10;
				System.out.print(rem+" ");
				temp=temp/10;
			}
			n=n*11;
			System.out.println();
		}
	}
}
