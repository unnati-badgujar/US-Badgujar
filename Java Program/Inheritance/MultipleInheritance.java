package Inheritance;
//Multiple Inheritance Demo
class A{  
	void display(){
		System.out.println("Hello");
	}  
}  
class B{  
	void display(){
		System.out.println("Welcome");
	}  
}  
class C extends A,B{//suppose if it were  
   
 public static void main(String args[]){  
   C obj=new C();  
   obj.display();//Now which display() method would be invoked?  
}  
}  
//output == Compile-time error