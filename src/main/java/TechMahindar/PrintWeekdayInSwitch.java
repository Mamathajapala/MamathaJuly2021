package TechMahindar;

import java.util.ArrayList;

public class PrintWeekdayInSwitch {

	public static void main(String[] args) {
	
		int i = 4;	
		
		switch(i) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Frinday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
			break;
	/*	default:
		System.out.println("Print the corect days");
		break;*/
		}
		
		String ar[] = new String[6];
		
		ar[0] = "Monday";
		ar[1] = "Tuesday";
		ar[2] = "Wednesday";
		ar[3] = "Thursday";
		ar[4] = "Friday";
		ar[5] = "Weekend";
		
		System.out.println(ar[2]);
		
		for(String e : ar) {
			System.out.println("arry: " +e);
	
		}
	 ArrayList<String> list = new  ArrayList<String>();
	 
	 list.add("Monday");
	 list.add("Tuesday");
	 list.add("Wednesday");
	 list.add("Thursday");
	 
	 for(String e : list) {
			System.out.println("ArrayList:  " + e);
		}
		
	}

}
