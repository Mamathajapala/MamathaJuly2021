package OOP_Inheritance;

public class Car extends Vehicle {
	
	//Final keyword -- it declares the final method it cannot be Override
	//Final method is use to prevent the method overriding
	//if we declare final keyword  class you cannot be inherit
	
	int engine = 10;
	public  void start() {
		System.out.println("Car ----start ");
		
	}
	public void stop() {
		System.out.println("Car ----stop ");
		
	}
	public void refuel() {
		System.out.println("Car ----refeul ");
		
	}
	
	public static void sunRoof() {
		System.out.println("Car -----sunRoof");
	}

}
