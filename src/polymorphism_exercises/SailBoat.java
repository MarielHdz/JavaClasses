package polymorphism_exercises;

public class SailBoat extends Boat{
	
	double width;
	
	public void sail() {
		System.out.println("sail boat");
	}
	
	@Override
	void move() {
		System.out.println("sailboat moves");		
	}

	@Override
	public void afloat() {
		System.out.println("sailboat afloat");		
	}

}
