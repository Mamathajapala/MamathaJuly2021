package OOP_Inheritance;

public class BMW extends Car {

	// Method Overriding: Ploy + morphism (Run time/ Dynamic)
	// When we have a parent class having the same method with the same name and
	// same number of parameters in child class is called method overriding
	// Static Method cannot be Overridden
	//Private methods cannot be Overridden
	//Overridden method are used in inheritance

	@Override
	public void start() {
		System.out.println("BMW ----start ");
	}

	public void autoParking() {
		System.out.println("BMW -------auto parking");//Reference type check is applied 
	}

	public static void sunRoof() {
		System.out.println("Car -----sunRoof");
	}

	// Method overloading: Ploy + morphism (Compile time)
	public void musicSystem() {
		System.out.println("BMW -- musicSystem");
	}

	public void musicSystem(String CD) {
		System.out.println("BMW -- musicSystem with " + CD);
	}

	public void musicSystem(String Radio, double radioFrequency) {
		System.out.println("BMW -- musicSystem with " + Radio + " frq-- " + radioFrequency);
	}

}
