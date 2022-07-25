package OOP_Encapsulation;

public class User {
	
	public String name;
	 public int age;
	 public int id;
	 
	 
	 
	 public User() {
			
		}
	public User(String name) {
	
		this.name = name;
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public User(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	


	
	
	 
	 
	 
	 
	 
	 

}
