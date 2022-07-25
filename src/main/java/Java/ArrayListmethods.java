package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListmethods {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Sam");
		name.add("mamu");
		name.add("Sam");
		System.out.println(name);
		System.out.println(name.size());
		name.clear();
		System.out.println(name.size());

		ArrayList<String> ls = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> ls1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> ls2 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));

		System.out.println(ls);
		System.out.println(ls.equals(ls2));
		System.out.println(ls2);
		Collections.sort(ls2);// sort method
		System.out.println(ls2);
		System.out.println(ls.equals(ls2));

		// web page --> dropdown-->5 element ---actulalist
		// explist -->elements
		ArrayList<String> ls3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> ls4 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));

		ls3.removeAll(ls4);// remove element common element from ls3from ls4
		System.out.println(ls3);

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sam");
		ar.add("mamu");
		ar.add("QA");
		ar.add("SQL");
		ArrayList<String> l = new ArrayList<String>();
		l.add("QA");
		l.add("mamu");
		l.add("Sam");
		l.add("Spring boot");
		
		ar.retainAll(l);//commom elements
		System.out.println("print the common data" + ar);
		ar.addAll(l);
		
		ls4.clear();
		System.out.println(ls4);

		ArrayList<String> ar1 = (ArrayList<String>) ls.clone();//copy
		System.out.println(ar1);

		// contains:
		System.out.println(ar1.contains("A"));

		// IndexsOf
		System.out.println(ar1.indexOf("B") > 0);
		System.out.println("Out put :" + ar1.lastIndexOf("QA"));

		// Capacity
		ArrayList<String> ar2 = new ArrayList<String>(2);
		ar2.add("Sam");
		ar2.add("mamu");
		System.out.println(ar2);

		ar2.ensureCapacity(15);

		// For each :Jdk 1.8 with lambda:
		ar1.forEach(e -> System.out.println(e));

	}

}
