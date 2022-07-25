package SuperKeyword;

public class LoginPage extends Page {
	
	
	public LoginPage(int time) {
		super(40);
		System.out.println("LoginPage constructor with time " + time);
		
	}
	
	int loadTime = 20;
	
	void loading() {
		System.out.println("child load time" + loadTime);
		System.out.println("page load time " + super.loadTime);
		pageTitle();
		super.pageTitle();
	}
	
	@Override
	public void pageTitle() {
		System.out.println("Login page title");
		
	}
	

}
