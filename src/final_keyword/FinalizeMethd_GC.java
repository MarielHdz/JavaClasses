package final_keyword;

public class FinalizeMethd_GC {

	/*
	  We can request jvm to run the garbage collector but still we won't know when
	  jvm will run it
	  
	  If you override finalize method in your class then your finalize method
	  version may run after calling System.gc();
	  
	  Remember that garbage collection is not guaranteed to run on demand.
	  
	  based on following example: If it doesn’t run at all, Option A would be
	  output. If it runs at the requested point, Option B would be output. If it
	  runs right at the end of the main() method, Option C would be output.
	 */

	public static void main(String[] args) {
		Toy car = new Toy();
		car.play();
		System.gc();
		Toy doll = new Toy();
		doll.play();

		// possible outputs:
		// A) play-play-
		// B) play-play-clean-
		// C) play-play-clean-clean-
	}
}

class Toy {

	public void play() {
		System.out.println("play-");
	}

	public void finalize() {
		System.out.println("clean-");
	}
}