package Java;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
	//ArrayList ---Dynamically arrylist 
	//Array list : to store the data dynamically ,it is a class
	//Its a index based collection ---linear collection	
	//When declare ArrayList ar = new ArrayList(); default  Virtual capacity is 10, physical capacity is 0.
		
		
		ArrayList<Object> ar = new ArrayList<Object>();//this arrylist is a Raw type 
		
		
		System.out.println(ar.size());
		ar.add(12);
		ar.add(20);
		ar.add("QA");
		ar.add(50);
		System.out.println(ar.size());
		ar.remove(2);
		
		//Print all the values
		
		for(Object e: ar) {
			System.out.println(e);
		}
		
		//Generics in Arraylist: 
		
		//Integer arraylist
		ArrayList<Integer> mark = new ArrayList<Integer>();
		mark.add(100);
		mark.add(100);
		mark.add(300);
		System.out.println(mark.get(2));
		System.out.println(mark);
		
		
		//String arraylist
		ArrayList<String> name = new ArrayList<String>();
		name.add("Sam");
		name.add("mamu");
		name.add("QA");
		System.out.println(name.get(2));
		
				
		for(int i=0; i<name.size(); i++) {
			System.out.println(name.get(i));
		}
		
		for(Object e : name) {
			System.out.println("list of name : " + e);
			if(e.equals("mamu")) {
				System.out.println("mamu is simple");
			}
		}
	}
	
}
