package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
		
		
		LoginPage lp = new LoginPage();
		lp.header();
		lp.title();
		lp.loading();
		lp.url();
		lp.loading();
		lp.logo();
		
		
		lp.doLogin("admin", "admin123");
		
		Page.logo();
		
		//Top casting
		Page p = new LoginPage();
		p.header();
		p.title();
		p.loading();
	
		
		
	}

}
