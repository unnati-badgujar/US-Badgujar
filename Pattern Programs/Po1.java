package Pattern;

public class Po1 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				if(i%2==0)
				{
					System.out.print("1");
				}		
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
			for(int j=i;j>5;j++)
			{
				if(i%2==0)
				{
					System.out.print("1");
				}		
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		}

	}

