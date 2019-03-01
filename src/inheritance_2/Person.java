package inheritance_2;

public class Person {

	public String name;
	public int age;
	protected int birthYear;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		if(getName().isEmpty() && getAge() == 0) {
			System.out.println("Error message");
		}
		
		System.out.println("name: " + name + " age: "+ age);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void eat() {

	}
}
