package Java;

import java.util.HashSet;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Selenium";
//      String reverse method is not available because is immutable
//		
		int len = str.length();
		System.out.println(len);
//		String rev ="";
//		
//		for(int i=len-1; i>=0;i--) {
//			
//			rev = rev+ str.charAt(i);
//		}
//		System.out.println(rev);
		
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
	
		String[] dup = new String[] {"Java", "Ruby","Java", "C", "C","Java",};
//	}
		System.out.println(reverseString(str));
		
		System.out.println(duplicateString(dup));
		
	}
	
	
	
	//reverse the string
	public static String reverseString(String value) {
		
		int len = value.length();
		if(len ==1) {
			return value;
		}
		String rev = "";
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+ value.charAt(i);
		}
		
		return rev;
	}
	
	//dupliate the String[]
	public static String duplicateString(String[] input) {
		
		Set<String> store = new HashSet<String>();
		String ret = null;
		
				for(String name:input)	{
					
					if(store.add(name) == false){
						System.out.println("dupliate element is :" + name);
							
				}
					
			}
				return ret;
				
	}
}