package Java;

public class SwitchCase {

	public static void main(String[] args) {
		
		//Switch case is used to over come else if condition, switch case directly jumps to the given key 
		//Along with the case we have pass key value
		//in the case you can write for loop ,if condition ..etc
		//floating and double values not allowed.
		//switch case is not applicable for boolean expression
		String lang = "JaVa ";
		
		switch (lang.toLowerCase().trim()) {
		case "java":
			System.out.println("Print Java");	
	
		case "C#":
			System.out.println("Print C#");	
	
		case "Paython":
			System.out.println("Print Paython");	

		default:
		System.out.println("Please pass the correct language");	
		}
		
		int	 bookcost 	= 1000;
		int  save 		= 100;

		switch (bookcost) {
		case 1000:
			save =100;
			System.out.println("cost of the book is 1000 print the your saving : " + save);	
			
			break;
		case 990:
			System.out.println("cost of the book is 1000");	
			save =80;
			break;
		case 800:
			System.out.println("cost of the book is 1000");	
			break;
		default:
			System.out.println("Please pass the correct cost of the bool");
			save =70;
			break;
	}
	}
}
