package Array;
/*WAP to print the details of employees from Employee[] array who has 
same salary (Create Employee class which has 3 attributes id, name, 
salary and add employee objects to your array).
*/

class Employee
{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getID()
	{
		return id;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	//toString()
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}
}
public class MultipleEmployeeData
{
	public static void main(String[] args) 
	{
		Employee employee[] = new Employee[3];
		employee[0] = new Employee(1,"Yash",20000);
		employee[1] = new Employee(1,"Unnati",40000);
		employee[2] = new Employee(1,"Rinku",30000);
		System.out.println(employee[0]+"\n"+employee[1]+"\n"+employee[2]);
		if(employee[0].getSalary()==employee[1].getSalary() )
		{
			System.out.println("\n Employee has same salary");
			System.out.println(employee[0]+"\n"+employee[1]);
		}
		else if( employee[1].getSalary()==employee[2].getSalary())
		{
			System.out.println("\n Employee has same salary");
			System.out.println(employee[1]+"\n"+employee[2]);
		}
		else if( employee[0].getSalary()==employee[2].getSalary())
		{
			System.out.println("\n Employee has same salary");
			System.out.println(employee[0]+"\n"+employee[2]);
		}
		else
		{
			System.out.println("\n Opps..... Employee has No same salary");		
		}
	}

}
