package polymorphism_exercises;

public class WaterFun {

	public static void main(String[] args) {
		
		Boat sail = new SailBoat();
		Boat row = new RowBoat();
		
		sail.move();    //sailboat moves
		sail.afloat();	//sailboat afloat
		row.move();     //rowboat moves
		row.afloat();   //rowboat afloat
		
		//boat array
		Boat[] boats = new Boat[2];
		
		boats[0] = sail; 
		boats[1] = row; 
		
		for (Boat each : boats) {    //sailboat moves  
			each.move();             //sailboat afloat 
			each.afloat();           //rowboat moves   
		}                            //rowboat afloat  
		
		
		Floatable sail2 = new SailBoat();
		Floatable row2 = new RowBoat();
		Floatable duck = new Duck();
		
//		sail2.move(); //move() is not specified in reference type so I get compile error
		sail2.afloat();	  //sailboat afloat
//		row2.move(); //move() is not specified in reference type so I get compile error
		row2.afloat();    //rowboat afloat
		duck.afloat();    //Duck afloats
		

		//floatable array
		Floatable[] floats = {sail2, row2, duck};

		for (Floatable each : floats) {    //sailboat afloat
			each.afloat();                 //rowboat afloat
		}                                  //Duck afloats
		
		
	}
}
