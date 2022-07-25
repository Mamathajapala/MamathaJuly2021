package OOP_Encapsulation;

public class Company {

	public String name;
	public int empCount;
	private int sharePrice;
	
	//Encapsulation: Hiding the implementation by private  and you can access  layer by public
	//for encapsulation set a value and get the value we will use setter and getter methods
	//Avd: it is used for data hiding, security
	//it doesn't show unnecessary data  it is user friendly example: ATM, employee details
	//Quit(); 
	public String getCEOName(){
		return "Tom";
		
	}
	private int getTotalSharePrice(){
		System.out.println("print");
		return 1000;
	}
	
	
	public static void main(String[] args) {
		
		Company obj = new Company();
		
		obj.name = "Altus";
		obj.empCount =200;
		obj.sharePrice = 10000;
		System.out.println(obj.name);
		
		obj.getCEOName();
		obj.getTotalSharePrice();
		
	}

}
