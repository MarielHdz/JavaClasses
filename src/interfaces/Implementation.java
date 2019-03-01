package interfaces;

/*
 * 	Is a special type in java that is used to achieve abstraction. Before java 8 interfaces were pure abstraction only abstract methods were allowed inside the interface. Now, 
	Interfaces can have abstract , static and default methods.
	
	1. A class can only extend one class. It can not extend to multiple classes or abstract classes.
	2. A class can implement multiple interfaces at the same time (class can inherit from multiple interfaces). 
	3. When we extend and implements at the same time then the extends keyword must come before implements keyword.
	4. When a class implements an interface then the class must provide implementation for the abstract methods.
	5. Can not be instantiated. 
		* We can not create an object from it
	6. Can not have a constructor
	7. Interface elements must be public:
		* Methods in an interface: 
			* are by default public abstract.
			* Can also be public default: 
				* must be public and 
				* have a body. 
				* it can be used as is or overridden by implementing classes
			* Can also be public Static: 
				* must be public and 
				* have a body. 
				* Should be called in a static way.
				* Static methods are not inherited so can not be overridden
		* Variables in an interface:
			* are by default constants fields. Constants = public static final variables 
	8. If an interface has an static method. The static method can only be called from the interface and not from the concrete class implementing the interface.
	9. An interface can extends multiple interfaces.
	10. First concrete class has to implement all the abstract methods from the interfaces.

 */

public class Implementation implements InterfaceTwo{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void compile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void design() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodFromInterfaceTwo() {
		// TODO Auto-generated method stub
		
	}

}
