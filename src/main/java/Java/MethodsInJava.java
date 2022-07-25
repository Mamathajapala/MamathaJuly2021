package Java;

public class MethodsInJava {
	
	//Can not create a method inside a method 
	//Method: a generic code to perform operation

	//Main method doesn't  return any thing
	public static void main(String[] args) {
		//create the Object
		MethodsInJava obj = new MethodsInJava();
		
		obj.test();
		
		int p = obj.getMarks();
		System.out.println(p);
		
		String name = obj.getName();
		System.out.println(name);
		
		int s = obj.sum(10, 20);
		System.out.println(s);
		
	}
	
	//1.no input and no output
	// void --does not return any value
	//return type : void in nature
	public void test() {
		 System.out.println("test method");
	}
	
	//2.no input but some return
	//return type : int
	public int getMarks(){
		System.out.println("Get marks");
		int total = 100;
		int bonus = 50;
		int totalMarks = total + bonus;
		return totalMarks;
	}
	
	public String getName() {
		System.out.println("Get marks");
		String s ="Toshi";
		return s;
	}
	
	//3.some input but some return
	//return type : String
		public int sum(int a,int b) {
			System.out.println("sum method");
			int sum = a +b;
			return sum;
		}
	
}
