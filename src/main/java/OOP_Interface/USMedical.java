package OOP_Interface;

public interface USMedical {
	
	int min_fee = 10;
	
	//Interface can not have method body
	//only method prototype (non static)
	//only method declaration
	//Interface can not hold any logic
	//Can not create the Object of the Interface
	//All the variable in Interface are static and final by default
	//by default abstract in nature 
	//100% abstract
	
	//Abstract methods:does not have method body
	public void orthoServices();
	
	public void physioServices();
	
	public void cardioServices();
	
	public void services911();
	
	public void emergencyServices();
	
	public void totalDoctors(int count);
	
	public void covidTest();
	//after JDK 1.8
	//1.we can have static method in Interface with the method body:
	
	public static void hospitalAdmin() {
		System.out.println("US - hospitalAdmin");
		
	}
	//We can have default method: --> default method is only for interface 
	//default method can be overridden
	
	public  default void billing(){
		System.out.println("US ---- billing");
	}

}
