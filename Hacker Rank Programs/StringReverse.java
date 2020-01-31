import java.util.Scanner;


public class StringReverse {

    public static void main(String[] args) {
        
    	String str, rev = "";
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter a string:");
        str = sc.nextLine();
   
        int length = str.length();
   
        for ( int i = length - 1; i >= 0; i-- )
           rev = rev + str.charAt(i);
   
        if (str.equals(rev))
           System.out.println(str+" is a palindrome");
        else
           System.out.println(str+" is not a palindrome");
   

    	
    	/*Scanner sc=new Scanner(System.in);
        String A=sc.next();
         Enter your code here. Print output to STDOUT. 
        StringBuffer str=new StringBuffer(A);
        StringBuffer temp=str.reverse();
        System.out.println("temp="+temp);
        System.out.println(str.reverse());
        if(temp.equals(str))
        	System.out.println("Yes");
        else
        	System.out.println("No");
*/    }
}