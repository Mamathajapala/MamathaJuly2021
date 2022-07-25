package OOP_Encapsulation;

public class UserTest {
	
	

	public static void main(String[] args) {

		User user = new User();
		
		//How to access the class variable
		//1st : directly accessing them
		user.name = "Santosh";
		System.out.println(user.name);
		
		//2.By using constructor 
		User u1 = new User("Mamatha", 25, 150);
		System.out.println(u1.name + " " + u1.age + " " + u1.id);
		
		//3.Setter and getter
		User u2 = new User();
		u2.setName("Tom");
		u2.setAge(28);
		u2.setId(234);
		System.out.println(u2.getName() + " " + u2.getAge() + " " + u2.getId());
		System.out.println(u2.name + " " + u2.age + " " + u2.id);
		
	}

}
