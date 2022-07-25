package BuilderPattern;

public class EcommUser {

	public static void main(String[] args) {
		
		//This violation of the page object model we don't have validation and annotations
		EcommApp shop = new EcommApp();
		
		shop.login("mamu@gmail.com", "mamu123")
		.doSearch("iphone", 1099).addToCart("iphone")
		.doPayment("CIBC BANK 22112", "Password123")
		.getEmail()
		.logout()
		.login()
		.doSearch("Airpods")
		.doPayment("TD Bank", "test123")
		.logout();
		
		
		int orderId= shop.generateOrderId();
		System.out.println(orderId);
		
		shop.login().doPayment("bank", "password").logout();
		
		shop.login().logout();
		
	}

}
