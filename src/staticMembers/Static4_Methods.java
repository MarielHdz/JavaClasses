package staticMembers;

public class Static4_Methods {

	
	public static double add(double param1, double param2) {
		return param1 + param2;
	}
	
	public static double subtrac(double param1, double param2) {
		return param1-param2;
	}
	
	public static double multiply(double param1, double param2) {
		return param1*param2;
	}

	public static double divide(double param1, double param2) {
		return param1/param2;
	}
	
	public static void staticMethod() {
		System.out.println("printStatic");
	}
	
	public void nonStaticMethod() {
		System.out.println("printNonStatic");
	}
}
