package polymorphic_method_parameter;

public abstract class Movie {

	String name;
	double movieLength;
	
	/**
	 * 
	 * @param name
	 * @param movieLength
	 */
	public Movie(String name, double movieLength) {
		this.name = name;
		this.movieLength = movieLength;
	}

	public abstract void printMovieInfo();

}
