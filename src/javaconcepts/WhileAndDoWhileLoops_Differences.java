package javaconcepts;

public class WhileAndDoWhileLoops_Differences {

	public static void main(String[] args) {
		// compiles: is infinite loop and anything after is unreachable
//		while(true) {
//			System.out.println("p");
//		}
//		
//		System.out.println("pao");

		// compiles: it would be an infinite loop but thanks to break statement print
		// line is reached
		while (true) {
			System.out.println("p");
			break;
		}

		System.out.println("pao");

		// compiles: is infinite loop because while loop does not have body - semicolon
		// ended the statement before reaching tie = "shoelace"; part otherwise without
		// the semicolon we would assign a new value to tie and while loop would be
		// false and then we would rech print statement
		String tie = null;
		while (tie == null)
			; // <-infinite loop
		tie = "shoelace";
		System.out.println(tie);

		System.out.println("pao");

		// compiles: is infinite loop and anything after is unreachable
//		while(2==2) {
//			System.out.println("p");
//		}
//		
//		System.out.println("pao");

		// do NOT compile:
//		while(false) {
//			System.out.println("p");
//		}

		// compiles: print once then gets out because condition is false and program
		// continues
		do {
			System.out.println("h");
		} while (false);

		System.out.println("pao");

		// we can eliminate curly braces if there is only one statement
		do
			System.out.println("h");
		while (false);

		System.out.println("pao");

		// compiles: is infinite loop and anything after is unreachable
//		do {
//			System.out.println("h");
//		} while (true);
//		
//		System.out.println("pao");
	}
}
