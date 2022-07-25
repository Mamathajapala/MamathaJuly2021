package OOP_Abstract;

public abstract class Application {
	
	//all the methods are abstract in nature
	//no non abstract method 
	
	
	public abstract void serverSetup();
	public abstract void dbSetup();
	public abstract void envSetup();
	
	public void UIlayerComponents() {
		System.out.println("application ---- UIlayerComponents ");
	}

}
