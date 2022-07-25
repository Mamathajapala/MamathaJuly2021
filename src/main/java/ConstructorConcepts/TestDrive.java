package ConstructorConcepts;

import java.util.ArrayList;

public class TestDrive {

	public static void main(String[] args) {
		
		CarDesign car_Honda = new CarDesign("Honda","Red");
		System.out.println(car_Honda.name + " " + car_Honda.colour);
		
		CarDesign car_BMW = new CarDesign("BMW","white",80, 'y');
		System.out.println(car_BMW.name + " " + car_BMW.colour + " "+car_BMW.price + car_BMW.isAvailable);
		
		ArrayList<String> audiQ8Features = new ArrayList<String>();
		audiQ8Features.add("Automatic Parking");
		audiQ8Features.add("Turbo Q Engine");
		audiQ8Features.add("Sun Roof");
		audiQ8Features.add("Rear Camera");
		audiQ8Features.add("lane Assist");
		audiQ8Features.add("Massage seats");
		
		CarDesign car_Q8 = new CarDesign("Audi","Grey", 90, 14.4,false, 'y',audiQ8Features);
		System.out.println(car_Q8.name + " " + car_Q8.colour + " " + car_Q8.price + " " + car_Q8.mileage + " " +  car_BMW.isAvailable + " " + car_Q8.featuresList);
		System.out.println(car_Q8.name + " " + car_Q8.colour);
	}

}
