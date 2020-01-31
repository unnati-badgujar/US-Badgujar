package Array;

public class TransportMatrixFor90 
{/*
	void transport(int a[][],int b[][])
	{
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=a[j][i];
			}
		}
	}
*/	
	public static void main(String[] args) 
	{
		int a[][]={{1,2,3},
				 	{4,5,6},
				 	{7,8,9}};
		int b[][]=new int[3][3];
		//TransportMatrixFor90 t= new TransportMatrixFor90();
		//t.transport(a,b);
	
		for(int i=a.length;i<=0;i--)
		{	
			int k=0;
			int n[]=a[k];
			for(int j=0;j<=2;j++)
			{
				b[i][j]=a[i][n[k]];
			}
			n[k]++;			
		}

		System.out.println("Result:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
