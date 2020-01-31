import java.util.Scanner;


public class StringDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
		String A=sc.next();
        String B=sc.next();
        int str1=A.length();
        int str2=B.length();
        System.out.println(str1+str2);
        if(str1<str2)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        char a[]=A.toCharArray();
        if(a[0]>=65 && a[0]<=90)
           	System.out.print(a[0]);	
        else
        	System.out.print((char)(a[0]-32));
        for(int i=1;i<a.length;i++)
    	{
    		System.out.print(a[i]);
    	}
        
        char b[]=B.toCharArray();
        if(a[0]>=65 && a[0]<=90)
           	System.out.print(" "+b[0]);	
        else
        	System.out.print(" "+(char)(b[0]-32));
        for(int i=1;i<b.length;i++)
        {
        	System.out.print(b[i]);
        }
    /*    
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));

*/	
	}
}
