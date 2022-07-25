package OOP_Abstract;

public class LoginPage extends Page {

	
	public LoginPage() {
		System.out.println("LoginPage  --- const");
	}
	
	@Override
	public void title() {
		System.out.println("LP --- title");
		
	}

	@Override
	public void url() {
		System.out.println("LP --- url -> http://www.xyz.com");
		
	}

	@Override
	public void loading() {
		System.out.println("LP --- loading");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with : " + un + pwd);
	}
	public void doLogin(String un, String pwd,String emailID) {
		System.out.println("login with : " + un + pwd);
	}
	

	
}
