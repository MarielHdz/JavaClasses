package polymorphic_method_parameter;

public class Action extends Movie{

	int actionLevel;
	
	
	/**
	 * 
	 * @param name
	 * @param movieLength
	 * @param actionLevel
	 */
	public Action(String name, double movieLength, int actionLevel) {
		super(name, movieLength);
		this.actionLevel = actionLevel;
	}
	
	@Override
	public String toString() {
		return "Action [name=" + name + ", movieLength=" + movieLength + ", actionLevel=" + actionLevel + "]";
	}
	
	public void printMovieInfo() {
		System.out.println(toString());
	}
}
