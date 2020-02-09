package Inheritance;
//Multilevel Inheritance Demo
class Company{  
	 float salary=40000;  
	}  
class Employee extends Company{  
	 int bonus=10000;    
}  

class Manager extends Employee {
	 int bonus=20000;  
}
public class MultilevelInheritance {
	 public static void main(String args[]){  
		   Manager m=new Manager();  
		   System.out.println("Employee salary is:"+m.salary);  
		   System.out.println("Bonus of Employee is:"+m.bonus);  
		   System.out.println("Manager salary is:"+m.salary);  
		   System.out.println("Bonus of Manager is:"+m.bonus);  

	   }
}
