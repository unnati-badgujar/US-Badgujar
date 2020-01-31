/*1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

*/

package Pattern;

public class P2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char first = 'A' , last = 'E';
        for(int i = 1; i <= 5; ++i)
        {
        	
            for(int j = 1; j <= i; ++j)
            {
                System.out.print(i + " ");
            }
           
	            first++;
	            System.out.println();
	        
           
          }


	}

}
