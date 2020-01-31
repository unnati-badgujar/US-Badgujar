/*
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 

*/

package Pattern;

public class P_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			int f=i;
			for(int j=1;j<=i;j++)
			{
			
					System.out.print(f+" ");
					f++;
			}
			System.out.println();
		}
	}

}
