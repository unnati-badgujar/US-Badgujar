package Pattern;

public class P__
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=4;i++)
		{

			for(int j=i;j>=1;j--)
			{
				System.out.print(j);			
			}
			if(i>=2)
			{
				for(int k=2;k<i+1;k++)
				{
					System.out.print(k);
				}
			}	
		System.out.println();
		}
	}
}
/*for(int j=i;j>=1;j--)
{
	System.out.print(j);			
}
if(i>=2)
{
for(int k=i;k<=i;k++)
{
	System.out.print(k);
}
}	
System.out.println();

*
*
*	for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j<=(i*2)-1)
				{
					System.out.print(b);
				}
				if(i<=j)
				{
					b++;
				}
				else
				{
					
				}
			}	
			System.out.println();
		}
*
*/