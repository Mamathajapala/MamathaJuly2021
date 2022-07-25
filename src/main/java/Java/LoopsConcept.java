package Java;

public class LoopsConcept {

	private static final int K = 0;

	public static void main(String[] args) {

		// 1. While loop
		// when ever Iteration not pre define we will use while loop
		int i1 = 0;
		while (i1 <= 10) {
			System.out.println(i1);
			i1++;
		}

		int j = 1;
		while (j <= 5) {
			System.out.println(j);
			j++;
		}

		// For loop:when ever Iteration pre defined we will use For loop

		for (int k = 1; k <= 10; k++) {
			System.out.println("Output for " + k);
		}

		// It always print infinite loop
		// for (;;) {
		// System.out.println("Hello");
		// }

		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c);
		}

		// Do While loop
		int p = 1;
		do {
			System.out.println(p);
			p++;
		} while (p < 10);

		// For loop with if condition: 1 to 100
		// when i find a number which is divisble 5 then print Hi

		for (int i2 = 1; i2 <= 100; i2++) {
			System.out.println(i2);
			if (i1 % 5 == 0) {
				System.out.println("Sammamu");
				break;

			}
		}
		System.out.println("---------------------------------------");
		// for each loop is used for array
		// Streams: JDK 8 for arraylist
		// 6.Foreach loop method --JDK 8
		int l[] = new int[3];
		l[0] = 10;
		l[1] = 20;
		l[2] = 30;
		for (Integer e : l) {
			System.out.println(e);
		}
		System.out.println("---------------------------------------");
		// even numbers
		for (int even = 2; even <= 20; even = even + 2) {
			System.out.println(even);
		}
		System.out.println("---------------------------------------");
		// odd number
		for (int odd = 1; odd <= 20; odd = odd + 2) {
			System.out.println(odd);
		}
		// char A-Z
		System.out.println("---------------------------------------");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c);
		}

		System.out.println("---------------------------------------");
		// print a-z
		for (int as = 97; as <= 122; as++) {
			System.out.println((char) as);
		}
		System.out.println("---------------------------------------");
		
		for(int t=1; t<=100; t++) {
			System.out.println(t);
			if(t%5==0) {
				System.out.println("hi");
			}
		}
		
		
	}
}
