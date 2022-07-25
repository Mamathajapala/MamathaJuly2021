package Java;

public class AmazonAppShopping {
	
	public static void main(String[] args) {
		
		
	AmazonApp shop = new AmazonApp();
	shop.login(87887777, 111111)
	//shop.search("iPhone13 pro Max");
	.search("iPhone13 pro Max")
	.addCart("iPhone13 pro Max")
	.payment(" 1234526 67821 1111")
	.logout();
	

}
}