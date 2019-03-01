package final_keyword;

public class FinalMethod {

	protected final void study() {
		System.out.println("super");
	}
	
	public static void main(String[] args) {
		new otherClass().study();  
	}
}

class otherClass extends FinalMethod{
	
	/*
	 * we can not override final methods. it will mark a compile error
	 */
	
//	//@Override
//	public final void study() {
//		System.out.println("sub");
//	}
}