package blocks;

public class ExtendingClass extends InstanceBlock{


	static {
		System.out.println("static block from subclass");
	}
	
	{
		System.out.println("instance block from subclass");
	}
	
	public ExtendingClass() {
		System.out.println("constructor from subclass");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(staticField1);
		staticMethod();

		InstanceBlock ib = new InstanceBlock();
		InstanceBlock ib2 = new InstanceBlock();

		System.out.println(ib.instanceField1);
		staticMethod();
		System.out.println(staticField1);

		ExtendingClass ec = new ExtendingClass();
		ExtendingClass ec2 = new ExtendingClass();

		
		System.out.println("main ended");
	}
}

/*
 * Output:
running static block 1
running static block 2
static block from subclass
main starts
staticField1
printing static method
instance block
instance block 2
constructor
instance block
instance block 2
constructor
instanceField1
printing static method
staticField1
instance block
instance block 2
constructor
instance block from subclass
constructor from subclass
instance block
instance block 2
constructor
instance block from subclass
constructor from subclass
main ended
 */