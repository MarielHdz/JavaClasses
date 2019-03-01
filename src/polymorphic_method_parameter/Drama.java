package polymorphic_method_parameter;

public class Drama extends Movie {

	int dramaLevel;

	/**
	 * 
	 * @param name
	 * @param movieLength
	 * @param dramaLevel
	 */
	
	public Drama(String name, double movieLength, int dramaLevel) {
		super(name, movieLength);
		this.dramaLevel = dramaLevel;
	}
	
	@Override
	public String toString() {
		return "Drama [name=" + name + ", movieLength=" + movieLength + ", dramaLevel=" + dramaLevel + "]";
	}

	public void printMovieInfo() {
		System.out.println(toString());
	}
}
