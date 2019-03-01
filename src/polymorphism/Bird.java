package polymorphism;

public abstract class Bird {

	private void fly() {
		System.out.println("Bird flies");
	}
	
	public static void main(String[] args) {
		Bird b = new Pelican(); //reference type decides what is visible
		b.fly(); //Bird flies //fly() is visible only because main is in same class.
	}
}


class Pelican extends Bird{
	
	protected void fly() { //overriding is not happening because fly() from super class is not visible
		System.out.println("Pelican flies");
	}
}