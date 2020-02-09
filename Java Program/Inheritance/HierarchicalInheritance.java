package Inheritance;
class Company{  
	 float salary=40000;  
	}  
class Employee extends Company{  
	 int bonus=10000;    
}  

class Manager extends Company {
	 int bonus=20000;  
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		   Employee e = new Employee();
		   System.out.println("Employee salary is:"+e.salary);  
		   System.out.println("Bonus of Employee is:"+e.bonus); 
		   
		   Manager m=new Manager();  
		   System.out.println("Manager salary is:"+m.salary);  
		   System.out.println("Bonus of Manager is:"+m.bonus);  
	}

}
