package Java;

public class Junk {

	public static void main(String[] args) {
	
		String s = "@ @ @? #%java *&&&*@@#+?%";
		
		String str = s.replaceAll("[^a-z A-Z 0-9]","");
		System.out.println(str);
		
		int i = 2345444;
		
		System.out.println(revinteger(i));
		
		
	}
		/**
		 * Reverse the integer 
		 * @param num
		 * @return
		 */
		
		public static int revinteger(int num) {
			
			int rev = 0;
			
			while(num!=0) {
			rev =	rev*10 + num%10;
			num = num/10;
				
			}
			
			return rev;
			
		
	}
	
	

}
