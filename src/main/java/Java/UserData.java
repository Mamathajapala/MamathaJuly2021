package Java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {
	
		//HashMap<String, String> userMap = new HashMap<String, String>();
		
		Map<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "Hyderabad");
		userMap.put(null, "pune");//HashMap can have allow one null key and multiple null values can allow
		userMap.put(null, "mumbai");
		userMap.put("city", null);
		userMap.put("cty", null);
		
		System.out.println(userMap.get("id"));
		System.out.println(userMap.size());
		
		
		for(Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		
		//Hashtable:
		
		Hashtable<String,Integer> productTable = new Hashtable<String,Integer>();
		productTable.put("Apple MacBook", 2000);
		productTable.put("Windows HP Laptop", 1000);
		productTable.put("Apple iPhone13 pro",1700);
		//productTable.put(null,null);//Hashtable doesn't allow null key and value
		
		
		System.out.println(productTable);
		System.out.println(productTable.get("Apple MacBook"));
		
		for(Map.Entry m : productTable.entrySet()) {
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		
		
		//HashMap is non synchronized -- not thread safe 
		//with concurrent hashMap you can synchronized but not 100%
		//HashMap can have allow one null key and multiple null values can allow
		
		//Hashtable is synchronized -- thread safe
		//Hashtable doesn't allow null key and value
	}

}
