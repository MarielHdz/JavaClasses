package inheritance_2;

public class Teacher extends Person {

	public int teacherID;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, int age, int teacherID) {
		this.teacherID = teacherID;
		this.age = age;
		this.name = name;
		
		if(getName().isEmpty() && getAge() == 0 && teacherID == 0) {
			System.out.println("Error message");
		}
		
		System.out.println("name: " + name + " age: "+ age + " teacherID: " + teacherID);
	}
	
	public void teach(String subject) {
		System.out.println("subjet is: " + subject);
	}
}
