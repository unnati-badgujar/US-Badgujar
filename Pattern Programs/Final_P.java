package Pattern;

public class Final_P 
{
	public static void main(String[] args) 
	{
/*		12345 
		2345 
		345 
		45 
		5 
		5 
		45 
		345 
		2345 
		12345 
*/
/*		int k=0;
		for(int i=1;i<=5;i++)
		{
			k=i;
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println(" ");
		}
		for(int i=5;i>0;i--)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
*/	
/*		ABCDEFGFEDCBA
		ABCDEF FEDCBA
		ABCDE   EDCBA
		ABCD     DCBA
		ABC       CBA
		AB         BA
		A           A
*/
/*		char c='A';
		for(int i=1;i<=7;i++)
		{
			c='A';
			for(int j=1;j<=13;j++)
			{
				if(j<=8-i||j>=6+i){
					System.out.print(c);
					if(j<7)
					c++;
					else
						c--;
				}
				else{
					System.out.print(" ");
					if(j==7)
					{
						c--;
					}
					//c++;
				}
			}
			System.out.println();
		}
*/
		char c='A';
		for(int i=1;i<=7;i++)
		{
			c='A';
			for(int j=1;j<=13;j++)
			{
				if(j<=8-i||j>=6+i){
					System.out.print(c);
					if(j<=7)
					c++;
					else
						c--;
				}
				else{
					System.out.print(" ");
					/*if(j==7)
					{
						c--;
					}
					//c++;
*/				}
			}
			System.out.println();
		}
		
/*		1
		12
		123
		1234
*/
/*		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
*/
/*		1
		22
		333
		4444
*/
/*		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
*/		
/*		A
		AB
		ABC
		ABCD
		ABCDE
*/
/*		char c='A';
		for(int i=1;i<=5;i++)
		{
			c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
*/
/*		1
		21
		321
		4321
*/
/*		for(int i=1;i<=4;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
*/		
/*		1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 
*/
/*		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
*/
	//===================================================================================	
/*		1 0 1 0 1 
		0 1 0 1 0 
		1 0 1 0 1 
		0 1 0 1 0 
		1 0 1 0 1 
*/
/*		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2!=0)
				{
					if(j%2!=0)
						System.out.print("1 ");
					else
						System.out.print("0 ");
				}
				else{
					if(j%2!=0)
						System.out.print("0 ");
					else
						System.out.print("1 ");
				}
				
			}
			System.out.println();
		}
*/		
//		1 0 1 0 1 
//		0 1 0 1 0 
//		1 0 1 0 1 
//		0 1 0 1 0 
//		1 0 1 0 1
		/*int counter=0;
		for(int i=1;i<=5;i++)
		{
			counter=i;
			for(int j=1;j<=5;j++)
			{
				if(counter%2==0)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
				counter--;
			}
			System.out.println();
		}
*
*/
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					if(j%2!=0)
						System.out.print("1 ");
					else
						System.out.print("0 ");
				}
				else{
					if(j%2!=0)
						System.out.print("0 ");
					else
						System.out.print("1 ");
				}
				
			}
			System.out.println();
		}
		
		
/*	      A      
	     ABC     
	    ABCDE    
	   ABCDEFG   
	  ABCDEFGHI  
	 ABCDEFGHIJK 
*/	 
/*	 char c='A';
		for(int i=1;i<=7;i++)
		{
			c='A';
			for(int j=1;j<=13;j++)
			{
				if(j>8-i&&j<6+i){
					System.out.print(c);
				c++;
				}
				else{
					System.out.print(" ");
					//c++;
				}
			}
			System.out.println();
			
		}*/
		
/*		$ 
		$ $ 
		$ $ $ 
		$ $ $ $ 
*/
/*		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
*/		
/*		$ $ $ $ 
		$ $ $ 
		$ $ 
		$ 
*/
/*		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				if(j>=i)
				System.out.print("$ ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
*/		
/* 	     $
	    $$
	   $$$
	  $$$$
*/
/*		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("$");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=1;j--)
			{
				if(i>=j)
				System.out.print("$");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
*/
/*		$$$$
		 $$$
		  $$
		   $
*/
/*		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j)
				System.out.print("$");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
*/
/*		$$$$$$
		$$  $$
		$    $
*/
/*		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j<=4-i||j>=3+i)
				System.out.print("$");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
*/	
		
/*	       $      
	      $$$     
	     $$$$$    
	    $$$$$$$   
	   $$$$$$$$$  
	  $$$$$$$$$$$ 
	 $$$$$$$$$$$$$
*/

/*		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=13;j++)
			{
				if(j>=8-i&&j<=6+i)
					System.out.print("$");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
*/
		
		
		
		
		
		
		
//		    $            
//        $ $ $          
//       $ $ $ $ $        
//     $ $ $ MI $ $ $ $      
//    $ $ $ $ $ $ $ $ $    
//   $ $ $ $ $ $ $ $ $ $ $  
//  $ $ $ $ $ $ $ $ $ $ $ $ $

/*		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=13;j++)
			{
				System.out.print(" ");
				if(j>=8-i&&j<=6+i){
					System.out.print("$");

					if(i==4&&j==6)
					{
						System.out.print(" MI");
					}
					if(i==4&&j==22)
					{
						System.out.print(" ");
					}
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
			
		}

*/		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
