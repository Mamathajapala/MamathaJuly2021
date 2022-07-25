package ConstructorConcepts;

import java.util.ArrayList;

public class CarDesign {

	
	String name;
	String colour;
	int price;
	double mileage;
	boolean isElectric;
	char isAvailable;
	ArrayList<String> featuresList;
	
	
	
	public  CarDesign(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}


	public CarDesign(String name, String colour, int price, char isAvailable) {
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.isAvailable = isAvailable;
	}


	public CarDesign(String name, String colour, int price, double mileage, boolean isElectric, char isAvailable,
			ArrayList<String> featuresList) {
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.mileage = mileage;
		this.isElectric = isElectric;
		this.isAvailable = isAvailable;
		this.featuresList = featuresList;
	}
			

	
	}


