package Array;
/* Create Employee class which has attributes (id, name, salary, dept, mydate). Where dept 
and mydate is class, dept has (dept_id, dept_name) And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter
*/
public class Employee_ 
{
	int id;
	String name;
	double salary;
	/*
	Department department = new Department(1004, "Computer");
	My_date my_date = new My_date(1,7,18);
*/	
	public Employee_(int id, String name, double salary)//Department department,My_date my_date)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	//	this.department = department;
	//	this.my_date = my_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee id= " + id + "\nName= " + name + "\nSalary= " + salary;
	//			+ "\nDepartment" + department + "\nMydate=" + my_date ;
	}
	
}
