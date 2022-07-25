package Java;

public class FinallyConcept {

	public static void main(String[] args) {
	
		
		//Finally keyword : Finally block is always executes code if exception is coming or not
		//Finally block should be return after try block 
		
		int p =10;
		
		try {
			int div = p/2;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("Hello");
	}

}
