package ExceptionHandling;

public class TryCatchBlock {

	
	String name;
	
	public static void main(String[] args) {
		
		//Throwable is super class of Exception class(Exception is coming unwanted logic from your code )
		//(problem with your code like IndexOutOfBoundsException,ArrayIndexsoutofboundsException)
		//and Error class(Error is coming because of environment, because of complier ,certain system rules)
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		try {
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.name = "Tom";
			System.out.println(obj.name);
			
			
			int i = 9/3;
			System.out.println("Bye");
			System.out.println("Bye");
		}//try will throw the exception
		catch(Exception e) {//catch will catch the exception
			System.out.println("some exception is coming ....");
			e.printStackTrace();
		}
	
		System.out.println("Hello");
		System.out.println("Hello");
		
	
	}
}
