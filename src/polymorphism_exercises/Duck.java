package polymorphism_exercises;

public class Duck implements Floatable {

	@Override
	public void afloat() {
		System.out.println("Duck afloats");
	}

	public void move() {
		System.out.println("Duck moves");
	}
}
