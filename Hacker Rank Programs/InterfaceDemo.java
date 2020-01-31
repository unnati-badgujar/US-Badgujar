/*
A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism. In this problem, you will practice your knowledge on interfaces.

You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.

divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.

Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.

Sample Input

6

Sample Output

I implemented: AdvancedArithmetic
12
Explanation

Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.

*/

import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}
class MyCalculato implements AdvancedArithmetic{
    public int divisor_sum(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
               
            }
        }
/*        public int divisorSum(int a)
        {

        int s=1;
        int f=0,v=0;
        while(s<=a)
            {
            if(a%s==0)
                {
                f=s;
                v+=f;
            }
            s++;

        }
        return v;


    }
*/
        return sum;      
    }
}
//Write your code here

public class InterfaceDemo{
    public static void main(String []args){
        MyCalculato my_calculator = new MyCalculato();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

