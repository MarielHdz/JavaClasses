package staticMembers;
import static java.lang.Math.*; //* imports all the static methods inside Math class
import static staticMembers.Static4_Methods.staticMethod;
public class Static2_Import {

	public static void main(String[] args) {	
		
		staticMethod();
//		add(1,3); // has error because is not imported
//		nonStaticMethod(); // has error because is no static

		System.out.println(PI);
		
		java.util.Scanner sc = new java.util.Scanner(System.in); //absolute path can be given when we do not want to import a class

	}
}
