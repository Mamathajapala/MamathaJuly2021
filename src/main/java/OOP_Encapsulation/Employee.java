package OOP_Encapsulation;

public class Employee {
	
	public String name;
	public int age;
	private int salary;
	private String address;
	
	//public getter & setter methods:
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
		
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		
		
	}

}
