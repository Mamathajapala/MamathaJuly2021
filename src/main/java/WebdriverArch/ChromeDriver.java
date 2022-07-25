package WebdriverArch;

public class ChromeDriver implements  WebDriver{

	public ChromeDriver() {
		System.out.println("launch Google Chrome browser");
	}
	
	@Override
	public void get(String url) {
		System.out.println("launching url " + url);
		
	}

	@Override
	public void getTitle() {
		System.out.println("title is : " + "google");
		
	}

	@Override
	public void getPageUrl() {
		System.out.println("title is : " + "http://www.google.com");
		
	}

	@Override
	public void findElement(String locator) {
		System.out.println("finging the element with " + locator);
		
	}

	@Override
	public void quit() {
		System.out.println("quit browser");
		
	}

}
