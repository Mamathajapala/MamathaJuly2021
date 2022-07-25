package Java;

public class IFElseCondition {

	public static void main(String[] args) {

		// < > == != <= >=

		int i = 100;
		int l = 205;
		
		if (i < l) {
			System.out.println("i is less than l");
		}
		if (i == l) {
			System.out.println("print true if equal");
		} else {
			System.out.println("Print flase");
		}
		
		// Compare string is used .equals
		String s1 = "java";
		String s2 = "java";

		if (s1.equals(s2)) {
			System.out.println("s1 is equal to s2  print true");
		}
		
		// Nested if
		// with in the if condition we are writing if condition two or more this is nested
		// if condition will check each and every statement is correct
		//else if  condition will check until you  statement is correct
		//Break cannot used out the loop or switch 
		// to over come this is use Switch case
		String lang = "java";

		if (lang.equals("java")) {
			System.out.println("Print Java");
		} else if (lang.equals("C#")) {
			System.out.println("Print C#");
		} else if (lang.equals("Python")) {
			System.out.println("Print Python");
		}
		else {
			System.out.println("Please pass the correct language");
		}
	}
}
