package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		//Finally block is always execute the code if exception or not
		//Finally block is written with try catch block
		System.out.println("A");
		try {
			//int i = 9/0;
			System.out.println("A");	
		}

		finally {
			System.out.println(" Bye .....");
		}
	
	//Make connection with DB
		//DB is down --- exception
	//un/pwd is wrong ----exception
	//Connectivity issue --- exception
	
	//2. connection is done
	
	//get the data using SQL ---- exception
	//use the data
	//Close the connection -- finally block
	
		System.out.println(getMarks("Tomnn"));
		
	}

	public static int getMarks(String name) {
		if(name.equals("Sonam")) {
			return 90;
		}
		else if(name.equals("Tom")) {
			try {
			int i = 9/3;
			return 45;
			} catch(Exception e) {
				return 50;
			}
			finally {
				System.out.println("inside finally block");
			return 10;
		}
		
		}
		else if(name.equals("Jason")) {
			return 95;
		}	
		
		return -1;
	}
	}