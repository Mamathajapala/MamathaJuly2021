package OOP_Abstract;

public abstract class Page {
	
	
	//Can not create object of abstract class
	//page class constructor will be called when we create the object of child class
	//some abstract methods and some non abstract methods:partial abstraction
	
	//Abstract method are create only in abstract class
	
	
	public Page() {
		System.out.println("Page  --- const");
	}
	
	
	public abstract void title();
	public abstract void url();
	public abstract void loading();
	
	public void header() {
		System.out.println("Page --- header");
	}
	
	public  static final void logo() {
		System.out.println("Page --- logo");
	}

}
