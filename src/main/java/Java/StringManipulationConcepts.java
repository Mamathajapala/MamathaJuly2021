package Java;

public class StringManipulationConcepts {

	public static void main(String[] args) {

		
		String str = "This is my java code and I am so happy";
		
		
		System.out.println(str.length());
		
		
		int len = str.length();
		int lo =0;
		System.out.println(lo);
		int hi = len-1;
		System.out.println(hi);
		
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(37));
		//System.out.println(str.charAt(38));//StringIndexOutOfBoundsException

		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf('s'));//1st occurrence of s
		
		//System.out.println(str.lastIndexOf('s', 15));
		//System.out.println(str.indexOf('s', 4));
		System.out.println(str.indexOf("s", str.indexOf('s')+1));
		
		System.out.println("position " + str.indexOf("s",str.indexOf('s')+1));
		
		System.out.println(str.indexOf("java"));
		
		
		String mesg = " Welcome admin";
		
		if(mesg.indexOf("admin")>=0) {
			System.out.println("correct mesg");
		}
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		//trim
		String s = "       hellow word    ";
		System.out.println(s.trim());
		
		//replace:
		String dob = "01-01-1969";
		System.out.println(dob.replace('-', '/'));
		
		//contains:
		
		String s2 = " Welcome admin";
		
		System.out.println(s2.contains("admin"));
		
		//concat
		String s11 = "hello";
		String s12 = "Selenium";
		
		System.out.println(s11.concat(s12).concat("Test automation").concat(" ").concat("python"));
		
		//SubString
		String s5 = "this is my order id 12345";
		
		System.out.println(s5.substring(11));
		System.out.println(s5.substring(0,9));
		System.out.println(s5.subSequence(s5.indexOf("id")+3, s5.length()));
		
		//split:
		String test = "Java-Python-JavaScript-Ruby";
		String arr[] = test.split("-");
		
		System.out.println(arr[0]);
		
		for(String e : arr) {
			System.out.println(e);
		}
		
		String x = "100";//if we have 100A  
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);//Exception will get: NumberFormatException
		
		int l = 100;
	
	}

}
