package Java;

public class StringConcat {

	public static void main(String[] args) {
		
		//Primitive data
		//Primitive are directly store in stack memory
		int 	a 	=	100;
		int	 	b 	= 	400;
		float 	f 	= 	90.00f;
		double 	d1 	= 	10.5;
		byte 	t 	=	55;
		short 	s	=	101;
	
		boolean flase;
		
		String x = "Qa";
		String y = "Automation";
		// String is collection of characters, it is non primitive data type
	
		//a-z : 97-122
		//A-Z : 65-90
		//0-9 : 48 -57
		
		// When we do Arithmetic with char only it will give askey values
		char c= 'a';
		char d='b';
		
		System.out.println(x+y);
		System.out.println(c+d);
		System.out.println(c);
		System.out.println(f+d1);
		System.out.println(x+y+a+b+f+t+s);
		System.out.println(a+b+x+y);
	
		//String concatenation is used to join two or more strings 
		//Modulus operator is returns the remainder of two number after division
		System.out.println(10%2);
		
		//Post increment
		int a1 =1;
		int b1 =a1++;
		System.out.println(a1);
		System.out.println(b1);
		
		//Pre increment
		int i 	=	10;
		int m	=	++i;
		System.out.println(i);
		System.out.println(m);
		
		//Post decrement
		int i1 	=	1;
		int m1	=	i1--;
		
		System.out.println(i1);
		System.out.println(m1);
		
		//pre decrement
		int i2	=	2;
		int m2	=	--i2;
		System.out.println(i2);
		System.out.println(m2);
		
	int t1 = 100;
	System.out.println(t1++);
	System.out.println(t1);
	System.out.println(++t1);
	System.out.println(t1--);
	System.out.println(t1);
	System.out.println(--t1);	
	
	//String is immutable 
	//Security - String are used in Network connection and data base, To avoid the access to those connection from external users, String is immutable.
	//Synchronization: it is automatically thread safe to solve the synchronization problem
	//Caching: if two String Objects are having same values, and you need only one String then the two objects will point same memory location pointing the String Objects.
		
	String s1 = "Santosh";// Santosh is String Pool
	
	//String Pool: String Pool used in Java to stored Pool of string in Java Heap Memory.
	//String pool is possible if String is immutable.
	//String pool help in saving lot of space in Java Runtime.
	
	//Memory location: Local variable are stored in Stack or Object reference(s1) are stored in Stack memory, String pool or assigned values(Santosh) are stored in Heap memory 
	
	//StringBuffer: String is mutable,String is not fix ,Synchronous in nature and thread safe 
	//Operation Delete,rev,capacity,length,append,insert,charAt
	String rev = "Mamatha";
	
	StringBuffer str = new StringBuffer(rev);
	//System.out.println(str.reverse());
	System.out.println(str.capacity());
	System.out.println(str.charAt(2));
	System.out.println(str.length());
	System.out.println(str.append(1));
	System.out.println(str.toString());
	System.out.println(str.codePointAt(1));
	
	
//StringBuilder: String is mutable,StringBuilder non Synchronization and not thread safe,it is faster
	
	String obj = " SanToSH ";
	StringBuilder sb = new StringBuilder(obj);
	System.out.println(obj.codePointBefore(4));
	System.out.println(obj.compareTo(rev));
	System.out.println(obj.trim());
	System.out.println(obj.toUpperCase());
	System.out.println(obj.toLowerCase());
	System.out.println(sb);

	}

	

}
