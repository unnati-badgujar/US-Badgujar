package Array;
//24.  Create Class Employee (id,name,Salary).Craete 5 Employess Objects.
//Employee information in descending order of  Salary using Array Of Objects
import java.util.Scanner;
import Inheritance.Employee_;
public class DecendingBySalary 
{
	public static void main(String[] args) 
	{
		Employee_ e[]= new Employee_[3];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter Id , Name and Salary");
			e[i]=new Employee_(s.nextInt(),s.next(),s.nextDouble());
		}
		System.out.println("Employee Information: \n-------------------------\n");
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]+"\n");
		}
		System.out.println("-------------------------");
		System.out.println("Descending order of  Salary");
		System.out.println("-------------------------");
		Employee_ temp;
		for(int i=0;i<e.length;i++)
		{
			for(int j=i+1;j<e.length;j++)
			{
				if(e[i].getSalary()<e[j].getSalary())
				{
					temp=e[i];
					e[i]=e[j];
					e[j]=temp;
				}
			}
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].getName()+"   "+e[i].getSalary()+"\n");
		}
	}
}
