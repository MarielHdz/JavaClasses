package javaconcepts;

public class chainingMethod_thisKeyword {

	int num;
	
	public chainingMethod_thisKeyword add(int num) {
		this.num += num;
		return this;
	}
	
	public static void main(String[] args) {
		
		chainingMethod_thisKeyword cm = new chainingMethod_thisKeyword();
		cm.add(12).add(12).add(5);
		System.out.println(cm.num);
	}
}
