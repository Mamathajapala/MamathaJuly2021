package ConstructorConcepts;

public  class Employee {
	String name;
	int age;
	String dob;
	String city;
	boolean isPremanent;
	
	//Constructor: will help me create the Object
	//Constructor--it is generic template of class
	//name of the Constructor will remain same as the class name.
	//it look like a function but it is not function.
	//Constructor will never return a value :no return and no void keyword in Constructor
	//but a function may or may not return a value
	
	//Use: Unnecessarily we are not create Object
	
	
//	public Employee() {
//		System.out.println("default constructor");
//	}
//	public Employee(int a) {
//		System.out.println("1 para const" + a);
//	}
	
	public  Employee() {
		
	}
	
	public Employee(String name) {

		this.name = name;
	}
	
	public Employee(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	

	
	
//create using right click ,mouse on source click on Generate Constructor using fields
	/**
	 * @param name
	 * @param age
	 * @param dob
	 * @param city
	 * @param isPremanent
	 */
	public Employee(String name, int age, String dob, String city, boolean isPremanent) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.city = city;
		this.isPremanent = isPremanent;
	}

	
	public static void main(String a[]) {
	
	Employee e1 = new Employee("Tom");
	System.out.println(e1.name);
	
	Employee e2 = new Employee("Tom", 21);
	System.out.println(e2.name + " " + e2.age);
	
	
	Employee e3 = new Employee("Tom", 21, "13-04-1995", "Toronto", true);
	System.out.println(e3.name + " " + e3.age + " " + e3.city + " " + e3.dob + " " + e3.isPremanent );
	
	
	
	
	
	
	
	
	
	
	

}
}
