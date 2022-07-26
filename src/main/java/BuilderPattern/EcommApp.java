package BuilderPattern;

public class EcommApp {

	
	public EcommApp login() {
		System.out.println("default login");
		return this;
	}
	
	public EcommApp login(String un, String pwd) {
		System.out.println("login with : " + un + ": " + pwd);
		return this;
	}
	
	public EcommApp doSearch(String productName) {
		System.out.println("sreach with : " + productName);
		return this;
	}
	
	public EcommApp doSearch(String productName, int price) {
		System.out.println("sreach with : " + productName + " price: " + price);
		return this;
	}
	
	public EcommApp selectProduct(String productName) {
		System.out.println("select the product : " + productName);
		return this;
	}
	
	public EcommApp addToCart(String productName) {
		System.out.println("adding the product in cart: " + productName);
		return this;
	}
	public EcommApp doPayment(String accountName, String pwd) {
		System.out.println("payment done vis: " + accountName + " : " + pwd);
		return this;
	}
	public int generateOrderId() {
		return 10002;
	}
	
	public EcommApp getEmail() {
		System.out.println("email is sent successfully.......");
		return this;
	}
	
	public EcommApp logout() {
		return this;
		
	}
	
}
