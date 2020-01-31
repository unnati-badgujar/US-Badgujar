/*
 
A 
B B 
C C C 
D D D D 
E E E E E 

*/


package Pattern;

public class P_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		        char first = 'A' ;
		        for(int i = 1; i <= 5; ++i)
		        {
		            for(int j = 1; j <= i; ++j)
		            {
		                System.out.print(first + " ");
		            }
		           
			            first++;
			            System.out.println();
			        
		           
		          }
		}
	

}
