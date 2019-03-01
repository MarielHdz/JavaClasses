package polymorphism;

public class Runner2 {

	public static void main(String[] args) {
		
		/*
		 * polymorphism helps me to access eat() method specific to my Object 
		 */
		
		Animal[] hungryMammals = new Animal[3];
		
		hungryMammals[0] = new Dog("Snoopy", 5, "chihuahua");
		hungryMammals[1] = new Cat("Tom", 1, "Kitten");
		hungryMammals[2] = new Horse();
		
		for(Animal each : hungryMammals) {
			each.eat();
		}
		
		/*
		 * Output:
		 	Dog eats
			Cat eats
			Horse eats
		 */
	}
}
