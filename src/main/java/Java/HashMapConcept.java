package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, String> obj = new HashMap<String, String>();

		// HashMap: HashMap class implements the Map interface it allows key and value
		// pair. It’s default virtual memory is 16, physical memory is 0. It convert
		// hashmap to hashcodeBinary code and store in memory.
		// Hashmap contains only unique keys
		// It can contain one null key, may be multiple null values
		// It can not allow duplicated value.
		// It is not thread safe and non synchronized but it make synchronous using
		// collection
		// It doesn’t maintain the order
		// it is traverse but not Enumeration
		obj.put("zoo", "Password123!");
		obj.put("sam", "Password123!");
		obj.put("aa",  "Password123!");

		System.out.println(obj);

		System.out.println(obj.get("mamu"));
		// System.out.println(obj.containsValue("Password123!"));

		// Itereate hashmap
		for (Entry<String, String> e : obj.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

		obj.forEach((k, v) -> System.out.println(k + " : " + (v)));

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("ZEE", 27, 85.33);
		Employee e2 = new Employee("Peter", 26, 80.33);
		Employee e3 = new Employee("QA", 32, 75.33);

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// Traverse the hashmap

		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee" + key + "Info");

			System.out.println(e.name + " " + e.age + " " + e.salary);

		}

		/*
		 * Iterator<Map.Entry<Integer, String>> iterator = emp.entrySet().iterator();
		 * while(iterator.hasNext()){ Map.Entry<Integer, String> entry =
		 * iterator.next(); System.out.printf("Key : %s and Value: %s %n",
		 * entry.getKey(), entry.getValue()); iterator.remove(); // right way to remove
		 * entries from Map, // avoids ConcurrentModificationException }
		 */

		 System.out.println("Iterate over LinkedHashMap");
	        for (Map.Entry<String, String> entry :
	             obj.entrySet()) {
	            System.out.println(entry.getKey() + " => "
	                               + ": " + entry.getValue());
	}

}
}
