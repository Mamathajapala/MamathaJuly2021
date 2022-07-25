package Java;

import java.util.ArrayList;

public class Company {
	
	String name;
	int empCount;
	
	public String getCEOName() {
		return "Tom";
	}
	
	public int getTotalcount() {
		System.out.println("get total count of the share");
		int totalshare = 200;
		
		return totalshare;
	}

	public String[] getCountFounders() {
		System.out.println("get total cofounder");
		
		String founder[] = new String[3];
		founder[0] = "Tom";
		founder[1] = "Peter";
		founder[2] = "Anne";
		
		return founder;
	}
	
	public ArrayList<String> getCustomerList() {
		ArrayList<String> cumList = new ArrayList<String>();
		
		cumList.add("Jenny");
		cumList.add("Sohel");
		cumList.add("Tony");
		cumList.add("Arno");
		
		return cumList;
		
	}
	
	public static void main(String[] args) {
	
		Company comp = new Company();
		System.out.println(comp.getCEOName());
		
		int share = comp.getTotalcount();
		System.out.println(share);

		String founderArr[] = comp.getCountFounders();
		System.out.println(founderArr.length);
		
		for(String e : founderArr) {
			System.out.println(e);
		}
		
		ArrayList<String> ar = comp.getCustomerList();
		System.out.println("total number of customers: " + ar.size());
		
		for(String e : ar) {
			System.out.println(e);
			
		}
		
	}

}
