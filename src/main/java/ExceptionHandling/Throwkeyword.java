package ExceptionHandling;

public class Throwkeyword {

	
	//Throw keyword --- we can generate  our own exception 
	
	
	
	public static void main(String[] args) {
		
		try {
			throw new Exception("EXCEL CELL DATA IS BLANK EXCEPTION");
		} catch (Exception e) {
			System.out.println("some exception is coming .....");
			e.printStackTrace();
		}
		
		
		
		
	
	}

}
