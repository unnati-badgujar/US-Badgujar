/*

ABCDEFGFEDCBA
ABCDEF FEDCBA
ABCDE   EDCBA
ABCD     DCBA
ABC       CBA
AB         BA
A           A
             
*/




package Pattern;

public class AtoG {

	public static void main(String[] args) 
	{
		
		char ch='A';
		int n=6,s=1,m=6;
		while(ch<='G')
		{
			System.out.print(ch);
			ch++;
		}ch--;
	 
		while(ch>'A')
		{
			ch--;
			System.out.print(ch);
			
		}
		System.out.println();

		for(int i=0;i<7;i++)
		{
			ch='A';
			for(int j=0;j<n;j++)
			{
				System.out.print(ch);
				ch++;
			}
			// second for loop for space
			for(int k=0;k<s;k++)
			{
				System.out.print(" ");		
			}
			ch--;
			// third for loop for last pattern print
			for(int j=0;j<m;j++)
			{
				System.out.print(ch);		
				ch--;
			}
			n--;
			m--;
			s=s+2;
			System.out.println();		
			
		}
	}

}
