package OOP_Abstract;

public class ApplicationTesting {
	
	public static void main(String[] args) {
		
		
		WhatsApp wt = new WhatsApp();
		
		wt.dbSetup();
		wt.serverSetup();
		wt.UIlayerComponents();
		wt.envSetup();
		
		
	}

}
