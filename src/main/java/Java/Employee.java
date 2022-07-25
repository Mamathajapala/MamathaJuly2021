package Java;

public class Employee {
	
	
	//Class variable this also now as global
	String name;
	int age;
	double salary;
	boolean isActive;

	








//public static void main(String[] args) {
//		
//	Employee e1 = new Employee();
//		
//		e1.name    = "Tom";
//		e1.age     =  27;
//		e1.salary  =  85.09;
//		e1.isActive = true;
//		
//		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isActive);
//		System.out.println(e1);
		
		public Employee(String name, int age, double salary){
			this.name =name;
			this.age =age;
			this.salary = salary;
		}
		
		//Class: Class is an entity to define the Objects or Class is template to create Objects
		//Object: Properties of Class is know as Object

		//RHS -- new Employee --is the Object
		//e1 -- object reference name
		//Employee -- class
		//non primitive data type 

		// Garbage Collect :JVM will calls  automatically GC take care of memory.
		//With out Object reference or null value will destroy the GC in heap memory and GC always check with JVM.		
		//System.gc();
		
	}
		
	
	


