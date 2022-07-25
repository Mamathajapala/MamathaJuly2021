package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital FH = new FortisHospital();
		
		FH.cardioServices();
		FH.emergencyServices();
		FH.ENTServices();
		FH.cardioServices();
		
		
		FH.gyncServices();
		FH.medicalInsurance();
		System.out.println(USMedical.min_fee);
		FH.totalDoctors(100);
		USMedical.hospitalAdmin();
		FH.billing();
		FH.medicaltraining();
		FH.covidTest();
		
		
		USMedical us = new FortisHospital();//Child class object can be referred by Parent interface reference variable
		
		us.cardioServices();
		us.emergencyServices();
		us.orthoServices();
		us.physioServices();
		us.services911();
	
	}

}
