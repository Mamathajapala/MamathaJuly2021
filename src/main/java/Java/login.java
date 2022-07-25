package Java;

public class login {
	
	String username;
	String password;
	String title;
	String url;


	@Override
	public void finalize() {//Garbage collector orJVM calle this method
	System.out.println("inside the finalize method");
}
	public static void main(String[] args) {
		
		login l1 = new login();
		l1.username = "Mamatha";
		l1.password ="Password123!";
		l1.title = "login";
		l1.url = "http://www.google.com";

		System.out.println((l1.username));
		
		

	}

}
