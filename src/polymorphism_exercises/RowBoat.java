package polymorphism_exercises;

public class RowBoat extends Boat{

	int paddleCount;

	public void row() {
		System.out.println("rowing a bowt");
	}

	@Override
	public void afloat() {
		System.out.println("rowboat afloat");			
	}

	@Override
	void move() {
		System.out.println("rowboat moves");	
	}
}
