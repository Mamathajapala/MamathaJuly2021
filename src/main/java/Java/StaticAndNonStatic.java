package Java;

public class StaticAndNonStatic {
	
	String name;
	static int age;

	public void getName() {
		System.out.println("get name");
	}
	
	public static void getInfo() {
		System.out.println("get Info");
	}
	
	
	public static void main(String[] args) {
		
		//can not create static var in local var
		int i =10;//local variable 
		//How to access non static vars and methods :
		//we have create the object of the class
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.name ="tom";
		System.out.println(obj.name);
		
		obj.getName();
		
		//How to call static var and methods:
		//1.you can call them directly : no need to use the object
		age = 25;
		System.out.println(age);
		
		getInfo();
		
		//getName();Non Static method
		
		//2.you can  call them using class name:
		StaticAndNonStatic.age = 32;
		System.out.println(age);
		StaticAndNonStatic.getInfo();
		
		//3. Can I use Object to call static vars and methods?
		
		obj.age = 40;// it will give warning call by static way
		
		//Static variable and methods are store in Common Memory allocation
		//Permanent Generation/CMA
		
	}

}
