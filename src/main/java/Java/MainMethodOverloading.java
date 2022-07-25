package Java;

public class MainMethodOverloading {

	// Can we Overload main method:Yes
	public static void main(String[] args) {
		System.out.println("Hello World");
		main(10);
		main(12,30);
		main(12, "Testing");
	}

	public static void main(int a) {
		System.out.println(a);

	}

	public static void main(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(int a, String c) {
		System.out.println(a + c);

	}
}
