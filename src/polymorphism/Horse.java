package polymorphism;

public class Horse extends Animal {

	public Horse() {
		this("default", 2);
	}
	
	public Horse(String name, int age) {
		super(name, age);
	}
	
	public void galope() {
		System.out.println("horse galope");
	}

	@Override
	public void printAnimalInfo() {
		System.out.println(toString());
	}
	
	@Override
	public void eat() {
		System.out.println("Horse eats");
	}
}
