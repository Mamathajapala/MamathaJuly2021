package Java;

public class AccessModifiers {

	
	// Public can be accessed anywhere in the program as long as we have an instance of this class it from
	public void doSomethingPublic() {
		
	}
	
	// Can be aceessed within the same class
	private void doSomethingPrivate() {
		
	}
	// Can be accessed within the package and sub classes of the class (inheritance).
	protected void doSomethingProtected() {
		
	}
	
	// Can be accessed within the package
	void doDefault() {
		
	}
	
	
	
}
