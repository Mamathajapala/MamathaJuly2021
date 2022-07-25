
package Java;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {
		
		//StaticArray: Size is fixed,to over come this we are going with array list 
		//array can store similar data types,to over come this we can use Object and arraylist.Array<Object>--Collection
		//lowest index is always 0 index
		//example for Static array is constants arrys like weekdays,month
		
		//int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		short i1[] ={10, 20, 30,40};
		
		int len = i1.length;

		System.out.println("length of array " + len);
		System.out.println("higheat index " + (len-1));
		System.out.println("lowest index " + 0);
		
		
		//System.out.println(i[4]);//ArrayIndexsoutofboundsException
		System.out.println(i);
		System.out.println(Arrays.toString(i));
	
		//How to print all the values from array: For loop
		
		for(int l=0; l<i.length;l++) {
		
			System.out.println(l+":"+i[l]);
			
		}
		//for each loop
		for(Integer e : i) {
			
			System.out.println(e+":"+e);
//			
	}
//		//double arry
		
		//char arry
		
		//String array
		String name[] = new String[3];
		name[0] = "mamatha";
		name[1] = "Tuppi";
		name[2] = "Santosh";
		
		System.out.println(name.length);
		
		for(String e : name) {
		System.out.println(e);
		}
		//Object Array: Object is Super class it is static array i can store different data types
		Object ob[] = new Object[3];
		ob[0] = "mamatha";
		ob[1] = 27;
		ob[2] = 's';
		
		for(Object j : ob) {
			System.out.println(j);
	
		}
	}

}