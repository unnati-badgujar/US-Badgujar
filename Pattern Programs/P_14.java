/*



A 
B B 
C C C 
D D D D 
E E E E E 

*/
package Pattern;

public class P_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) // row
		{
			int c=i;	//initialize c = i 
			
			for(int j=1;j<=i;j++) //column
			{
				System.out.print(c+" "); 
				c--;	
			}
			System.out.println();
		}

	}

}
