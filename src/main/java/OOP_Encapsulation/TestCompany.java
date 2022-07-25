package OOP_Encapsulation;

public class TestCompany {

	public static void main(String[] args) {
	
		Company c1 = new Company();
		
		c1.name = "ABC";
		c1.empCount = 1200;
		c1.getCEOName();
		
		Employee e1 = new Employee();
		e1.setSalary(1000);
		e1.getSalary();
		
		System.out.println(e1.getSalary());
		e1.setSalary(2000);
		System.out.println(e1.getSalary());
		
		e1.setAddress("Whitby");
		System.out.println(e1.getAddress());
		
	}

}
