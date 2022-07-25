package Java;

public class FinalizeConcept {

	public static void main(String[] args) {
		
		//Finalize: it is special method associate with Garbage collector
		//finalize is method
	
		FinalizeConcept obj = new FinalizeConcept();
		//obj = null;
		
		login l1 = new login();
		l1 = null;
		System.gc();
		
		System.out.println("Hello");
	}
	
	@Override
	public void finalize() {//Garbage collector orJVM calle this method
	System.out.println("inside the finalize method");
}
}
