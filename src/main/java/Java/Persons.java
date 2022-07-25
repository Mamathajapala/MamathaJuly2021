package Java;

public class Persons {

	public static void main(String[] args) {
		
		Persons p1 = new Persons();
		p1.getName();
		p1.getFristName();

	}

	public void getName() {
		getFristName();
		getCity();
		System.out.println("Mamatha");

	}

	public void getFristName() {
		getCity();
		System.out.println("Renikunta");

	}

	public void getCity() {
		//getAddress();
		System.out.println("Whitby");

	}

	public void getAddress() {
		//getPhone();
		System.out.println("2-10 Kennedy Rd");

	}

	public void getPhone() {
		//System.out.println("678998765567");

	}
}
