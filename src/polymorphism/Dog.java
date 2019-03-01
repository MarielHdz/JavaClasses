package polymorphism;

public class Dog extends Animal {

	String type;
	public String hidden = "hiddenDog";
	
	public Dog(String name, int age, String type) {
		super(name, age);
		this.type = type;
	}
	
	public void barks() {
		System.out.println("dog barks");
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", type=" + type +"]";
	}

	@Override
	public void printAnimalInfo() {
		System.out.println(toString());
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eats");
	}
}
