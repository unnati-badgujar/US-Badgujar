package Pattern;
/* 
2  3  4  6  6  9  8 
10  12  12  15  14  18  16 
18  21  20  24  22  27  24 
*/

public class P_2And3Table 
{
	public static void main(String[] args) 
	{
		int num1=1 ,num2=1 ,r=3 ,p=2;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=7;j++)
			{
		/*		System.out.print(p+" ");
				p=p+2;
				System.out.print(r+" ");
				r=r+3;
			*/
				if(j%2==0)
				{
					System.out.print(" "+r*num1+" ");
					num1++;
				}
				else
				{
					System.out.print(" "+p*num2+" ");
					num2++;
				}
			}
			System.out.println();
		}
	}
}
