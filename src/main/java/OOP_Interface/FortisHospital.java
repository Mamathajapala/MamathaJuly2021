package OOP_Interface;

public class FortisHospital extends MedicalAssociation implements USMedical, UKMedical, IndianMedical, WHO{

	
	@Override
	public void orthoServices() {
		System.out.println(" FH --- OrthoServices");

	}

	@Override
	public void physioServices() {
		System.out.println(" FH --- physioServices");

	}

	@Override
	public void cardioServices() {
		System.out.println(" FH --- cardioServices");
	}


	public void totalDoctors(int count) {
		System.out.println(" FH --- totalDoctorsCount = " + count);
	}
	
	@Override
	public void gyncServices() {
		System.out.println(" FH --- gyncServices");

	}

	@Override
	public void neuroServices() {
		System.out.println(" FH --- neuroServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println(" FH --- oncologyServices");

	}

	@Override
	public void pedioServices() {
		System.out.println(" FH --- pedioServices");

	}

	@Override
	public void ENTServices() {
		System.out.println(" FH --- ENTServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH --- emergencyServices");

	}

	@Override
	public void services911() {
		System.out.println("FH --- services911");

	}
	
	public void pathologyServices() {

		System.out.println("FH  --- pathologyServices");
	}

	public void medicalInsurance() {

		System.out.println("FH  --- medicalInsurance");
	}
	
	@Override
	public  void billing(){
		System.out.println("FH ---- billing");
	}
	
	@Override
	public void medicaltraining(){
		System.out.println("FH  ---  medicaltraining");
		
	}
	
	//WHO
	@Override
	public void covidTest() {
		System.out.println("FH --- covidTest");
	}
	
}
