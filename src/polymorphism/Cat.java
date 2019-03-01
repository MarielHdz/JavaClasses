package polymorphism;

public class Cat extends Animal{

	String type;
	public String hidden = "hiddenCat";


		public Cat(String name, int age, String type) {
		super(name, age);
		this.type = type;
		// TODO Auto-generated constructor stub
	}
	
	public void meows() {
		System.out.println("cat meows");
	}
	
	@Override
	public void printAnimalInfo() {
		System.out.println(toString());
	}
	
	@Override
	public void eat() {
		System.out.println("Cat eats");
	}

}
