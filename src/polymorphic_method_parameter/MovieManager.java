package polymorphic_method_parameter;

public class MovieManager {

	public static void main(String[] args) {
		
		Movie actionMovie = new Action("Karate Kid", 2.00, 2);
		Movie dramaMovie = new Drama("Casa Blanca", 3.00, 5);
		Action realActionMovie = new Action("Jurassic Park", 2.00, 3);
		
		displayMovieInfo(actionMovie);
		displayMovieInfo(dramaMovie);	
		displayMovieInfo(realActionMovie);	
		
		/*Output:
		 	Movie: Action [name=Karate Kid, movieLength=2.0, actionLevel=2]
			Movie: Drama [name=Casa Blanca, movieLength=3.0, dramaLevel=5]
			Action Movie: Action [name=Jurassic Park, movieLength=2.0, actionLevel=3]
		 */		
	}
	
	public static void displayMovieInfo(Action action) {
		System.out.print("Action Movie: ");
		action.printMovieInfo();
	}
	
	public static void displayMovieInfo(Movie movie) {
		System.out.print("Movie: ");
		movie.printMovieInfo();
	}
	
	//RETURN TYPE AND POLYMORPHISM
	
	public Movie getMovie() {
		Movie actionMovie = new Action("Karate Kid", 2.00, 2);
		Movie dramaMovie = new Drama("Casa Blanca", 3.00, 5);
		Action realActionMovie = new Action("Jurassic Park", 2.00, 3);

		/*
		 * -I can return an object with Movie reference
		 * -I can return any object type from a class that extends  Movie abstract class
		 */
		return actionMovie;
//		return dramaMovie;
//		return realActionMovie;

	}
}
