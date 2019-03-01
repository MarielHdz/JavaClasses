package polymorphism;

public class Animal implements Mammal {

	boolean EAT_PLANTS = false;
	public String name;
	public int age;
	public String hidden = "hiddenAnimal";
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	@Override
	public void eat() {
		System.out.println("Animal eats");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	public void printAnimalInfo() {
		System.out.println(toString());
	}
	
	public void legNumber() {
		System.out.println("Animal can have 2 or 4 legs");
	}
}
