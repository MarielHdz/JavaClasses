package polymorphism;

public interface Mammal {

	boolean EAT_PLANTS = true;
	void eat();
	default void legNumber() {
		System.out.println("Mammal can have 2 or 4 legs");
	}
}
