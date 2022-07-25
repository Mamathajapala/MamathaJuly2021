package Java;

public class LoginPage {

	public static void main(String[] args) {
		
		LoginPage lo = new LoginPage();
		lo.login("admin","Password");
		lo.Search("iPhone", 10000);

	}

	//Method Overloading:
	//With in the same class,when we have different methods with the same name and different input parameters
	//Sequence of the parameters also different
	//Example is amazon search,login pages, do payment
	//uses :flexibility and user friendly 
	
	public void login() {// 0
		System.out.println("login to app");

	}

	public void login(int a) {// 1

	}

	public void login(int a, int b) {// 2

	}

	public void login(int a, String b) {// 2

	}

	public void login(String a, String b) {// 2

	}
	
	public void Search() {
		System.out.println("login to app");

	}

	public void Search(String name) {

	}

	public void Search(String name, int price) {
		System.out.println("Product name : " + name);
		System.out.println("Product name : " + price);

	}

	public void Search(String name, int price, String colour) {

	}

	public void Search(String sellerName, int price, boolean available) {

	}
}
