package Java;

public class TestDrive {

	public static void main(String[] args) {
		
			CarDesign c1 = new CarDesign();
			c1.name = "Honda";
			c1.colour = "White";
			c1.price = 60;
			c1.getCarInfo();
			
			CarDesign c2 = new CarDesign();
			c2.name = "BMW";
			c2.colour = "Gray";
			c2.price = 80;
			
			CarDesign c3 = new CarDesign();
			c3.name = "volvo";
			c3.colour = "red";
			c3.price = 90;
			
			System.out.println(c1.name + " " + c1.colour + " " + c1.price + " " + c1.wheels);
			System.out.println(c2.name + " " + c2.colour + " " + c2.price + " " + c2.wheels);
			System.out.println(c3.name + " " + c3.colour + " " + c3.price + " " + CarDesign.wheels);

			CarDesign.steering();
	}

}
