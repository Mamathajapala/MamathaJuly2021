package WebdriverArch;

public class GoogleAppTesting {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		//ChromeDriver driver = new ChromeDriver();
		
		//FireForDriver driver = new FireForDriver();
		
		//SafariDriver driver = new SafariDriver();
		
		//Top Casting: Cross browse testing
		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("Firefor")) {
			driver = new FireForDriver();
		}
		else{
			driver = new SafariDriver();
		}
		
		
		
		
		driver.get("http://www.google.com");
		driver.getTitle();
		driver.getPageUrl();
		driver.findElement("username");
		driver.quit();
		
		

	}

}
