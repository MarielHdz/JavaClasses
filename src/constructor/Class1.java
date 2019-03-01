package constructor;

/*
 * 	Main purpose of a constructor is to set the state of an object. 
	If we do not create a constructor in our class then the compiler creates one by default. This default constructor is invisible and is call everytime we create an object.
	If we create a constructor then the compiler will not create a default constructor.
	Constructor must have the same name than the class and does not have a return type.
	we can call a method inside the constructor.
	
	constructor overloading:
	We can have more than one constructor in our class. They  all should have same class name and different method signature.
	
	Chaining constructor
	We can call a constructor from inside another constructor by using the "this" keyword. Only a constructor can call another constructor from inside the same class.
	when we call another constructor inside a constructor then the call must be the first line
 */
public class Class1 {
	public Class1(int num) {
		System.out.println("constructor from Class1");
	}	
	
	public static void main(String[] args) {		
		Class1 c1 = new Class1(0); //constructor from Class1.
		Class2 c2 = new Class2(0); //constructor from Class1, Constructor from Class2.
		Class3 c3 = new Class3(); //constructor from Class1, constructor from Class2, constructor2 from Class3, constructor from Class3.
		Class3 c4 = new Class4(); //constructor from Class1, constructor from Class2, constructor2 from Class3, constructor from Class3, constructor from Class4.
	}
}

class Class2 extends Class1 {	
	public Class2(Object o) {
		super(1);
		System.out.println("constructor from Class2");
	}
}

class Class3 extends Class2 {	
	public Class3() {
		this(""); //<-calling second constructor which is calling super class constructor
		System.out.println("constructor from Class3");
	}
	
	public Class3(String str) {
		super("constructor call an object and String is an object");
		System.out.println("constructor2 from Class3");
	}
}

class Class4 extends Class3 {	
	public Class4() {
		super();
		System.out.println("constructor from Class4");
	}
}

