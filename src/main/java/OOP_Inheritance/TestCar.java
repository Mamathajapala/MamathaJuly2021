package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();//Overridden
		b.stop();//Inherited
		b.refuel();//Inherited
		b.autoParking();//Child class
		BMW.sunRoof();
		System.out.println(b.engine);
		b.engine();
		b.musicSystem();
		b.musicSystem("Hollywood");
		b.musicSystem("FM", 98.9);
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.sunRoof();
		System.out.println(c.engine);
		c.engine();
		
		//Top casting
		Car c1 = new BMW(); //Child class Object can be referred by parent class ref variable 
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		Vehicle v1 = new BMW();
		v1.engine();
	
		
		
		//Down casting: not allowed in java run time
		//BMW b1 = (BMW)new Car();//ClassCastException will thrown at RunTime.
	}

}
