package Inheritance;
//Single Inheritance Demo
class Company{  
	 float salary=40000;  
	}  
class Employee extends Company{  
	 int bonus=10000;    
}  
public class SingleInheritance{
	 public static void main(String args[]){  
		   Employee p=new Employee();  
		   System.out.println("Employee salary is:"+p.salary);  
		   System.out.println("Bonus of Employee is:"+p.bonus);  
	   }
}
