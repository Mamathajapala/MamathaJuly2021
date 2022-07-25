package OOP_Encapsulation;

public class WebDriverTool {

	public void lauchBrowser(String browser) {
		
		if(browser.equals("chrome")) {
			lauchChrome();
	}
		else if(browser.equals("firefox")) {
			lauchFirefox();
		}
		else if(browser.equals("safari")) {
			lauchSafari();
		}
		else{
			System.out.println("Launch the correct browser");
		}
		}
	
	
	
	private void lauchChrome() {
		System.out.println("launch google Chrome");
		System.out.println("check OS version");
		System.out.println("checkWindowsRAM");
		
	}

	private void lauchFirefox() {
		System.out.println("launch google Chrome");
		System.out.println("check OS version");
		System.out.println("checkWindowsRAM");

	}
	private void lauchIE() {
		System.out.println("launch google Chrome");
		System.out.println("check OS version");	

	}
	private void lauchSafari() {
		System.out.println("launch google Chrome");
		System.out.println("check OS version");
		

	}
}
