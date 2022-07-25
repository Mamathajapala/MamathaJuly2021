package TechMahindar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateInString {

	public static void main(String[] args) {


		String obj = "Array";
		
		int len = obj.length();
		
		//System.out.println(obj("Array"));
		
		//split
		
		StringBuffer b = new StringBuffer();
		
		String i[] = new String[5];
		
		i[0] = "Mamatha";
		i[1] = "Santosh";
		i[2] = "Mamatha";
		i[3] = "Santosh";
		i[4] = "Santosh";
		
			//int name = i.length;
			
			for (int k = 0; k<i.length; k++) {
				System.out.println(""+i[k]);
			}
			
		Map<String,Integer> map = new HashMap<String,Integer>();
			
			for(String e : i ) {
				Integer old = map.get(e);
				if(old ==null) {
					old =0;
				}		
				map.put(e, old+1);				
			}
			System.out.println("duplicate count: "+ map);
	

	String names[] = {"Java", "JavaScript", "Ruby","C","Python","Java","Java","C"};
	//1.compare each element using 2 for loops
	
	//2.using HashSet: Java collection :it store unique values: O(n)
	
	Set<String> store = new HashSet<String>();
	
			for(String name:names)	{	
				if(store.add(name) == false){
					System.out.println("dupliate element is :" + name);
			}

	}
	//3. using HasMap :O(2n)
			
	Map<String,Integer> storeMap = new HashMap<String,Integer>();
	for(String name : names) {
		Integer count = storeMap.get(name);
		
		if(count == null) {
			storeMap.put(name, 1);	
		}
		else {
			storeMap.put(name, ++count);
		}
	}
		//get the values from this HashMap:
		
		Set<Entry<String,Integer>> entrySet =  storeMap.entrySet();		
		for(Entry<String,Integer> entry : entrySet) {
			
			if(entry.getValue()>1) {
			System.out.println("Print duplicate element is : " + entry.getKey());
			}		
		}

	}

}