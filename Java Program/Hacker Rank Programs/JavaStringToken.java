import java.util.Scanner;

/*Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
 * We define a token to be one or more consecutive English alphabetic letters. 
 * Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, .

Constraints

 is composed of any of the following: English alphabetic letters, blank spaces, 
 exclamation points (!), commas (,), question marks (?), periods (.), 
 underscores (_), apostrophes ('), and at symbols (@).

Output Format

On the first line, print an integer, , denoting the number of tokens in string
(they do not need to be unique). Next, print each of the  
tokens on a new line in the same order as they appear in input string .

=====Sample Input

He is a very very good boy, isn't he?

=====Sample Output

10
He
is
a
very
very
good
boy
isn
t
he

Explanation

We consider a token to be a contiguous segment of alphabetic characters. 
There are a total of  such tokens in string , and each token is printed in the same order 
in which it appears in string .
*/


public class JavaStringToken {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int count=1;
        for(int i=0; i<s.length()-1; i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
                count++;
        }
        System.out.println(count);
        
        String[] str = s.split(" ");
        
        for(int i=0;i<str.length;i++)
        	System.out.println(str[i]);

        scan.close();
    }
}
