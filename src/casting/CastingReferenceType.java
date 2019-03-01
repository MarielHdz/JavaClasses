package casting;

public class CastingReferenceType {

	public static void main(String[] args) {

		/*
		 * Upcasting Casting from a subclass to a superclass is called upcasting.
		 * Typically, the upcasting is implicitly performed by the compiler. putting an
		 * specific type in a general type
		 * 
		 * Downcasting Casting from a superclass type to subclass type is called
		 * downcasting. The downcasting has to be performed by the programmer
		 * explicitly. putting a general type in an specific type.
		 */

		System.out.println("\n*********************UPCASTING*****************************");

		Engineer e1 = new Engineer("Paola", 31, 1111);
		Person e2 = new Engineer("Nena", 25, 2222);
		Object e3 = (Object) e1;// explicit upcasting can be done but is unnecessary. compiler does that
								// automatically

		((Person) e1).getName();// explicit upcasting is unnecessary
		System.out.println("Engineer as Engineer have access to own, Person and object class methods:");
		System.out.println("name: " + e1.name + " age: " + e1.age + " trainingID: " + e1.trainingID);
		System.out.println("getTrainingID method " + e1.getTriningID());
		e1.design("design");
		e1.personClassAccessGranted();
		System.out.println("hashcode from Object: " + e1.hashCode());

		System.out.println();
		System.out.println("Engineer as Person have access to Person and Object class methods:");
		System.out.println("name: " + e2.name + " age: " + e2.age);
		e2.personClassAccessGranted();
		System.out.println("hashcode from Object: " + e2.hashCode());

		System.out.println();
		System.out.println("Engineer as Object have access to Object class methods:");
		System.out.println("hashcode from Object: " + e3.hashCode());

		System.out.print("\nPerson instanceof Engineer: ");
		System.out.println(e2 instanceof Engineer);// true
		System.out.print("Object instanceof Person: ");
		System.out.println(e3 instanceof Person);// true
		System.out.print("Object instanceof Engineer: ");
		System.out.println(e3 instanceof Engineer);// true

		System.out.println("\n*********************DOWNCASTING***************************");

		System.out.println();
		((Engineer) e2).design("direct downcasting"); // we can cast directly to perform an specific task
		// or we can cast and assign to reference type
		Engineer e4 = (Engineer) e2; // casting person (general type) to engineer (specific type)
		Engineer e5 = (Engineer) e3; // casting object (general type) to engineer (specific type)
		Person e8 = (Person) e3; // casting object (general type) to Person (specific type)

		System.out.println();
		System.out.println("Person as Person casted to Engineer have access to own, Person and object class methods:");
		System.out.println("name: " + e4.name + " age: " + e4.age + " trainingID: " + e4.trainingID);
		System.out.println("getTrainingID method " + e4.getTriningID());
		e4.design("design");
		e4.personClassAccessGranted();
		System.out.println("hashcode from Object: " + e4.hashCode());

		System.out.println();
		System.out.println("Object as Object casted to Engineer have access to own and object class methods:");
		System.out.println("name: " + e5.name + " age: " + e5.age + " trainingID: " + e5.trainingID);
		System.out.println("getTrainingID method " + e5.getTriningID());
		e5.design("design");
		e5.personClassAccessGranted();
		System.out.println("hashcode from Object: " + e5.hashCode());

		System.out.println();
		System.out.println("Object casted as Person have access to Person and object class methods:");
		System.out.println("name: " + e8.name + " age: " + e8.age);
		System.out.println("getTrainingID method " + e4.getTriningID());
		e8.personClassAccessGranted();
		System.out.println("hashcode from Object: " + e8.hashCode());
		
		System.out.print("\nEngineer instanceof Engineer: ");
		System.out.println(e4 instanceof Engineer);// true
		System.out.print("Person instanceof Person: ");
		System.out.println(e8 instanceof Person);// true
	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void personClassAccessGranted() {
		System.out.println("personClassAccessGranted");
	}
}

class Engineer extends Person implements Smarty {

	int trainingID;

	public Engineer(String name, int age, int trainingID) {
		super(name, age);
		this.trainingID = trainingID;
	}

	public int getTriningID() {
		return trainingID;
	}

	public void design(String str) {
		System.out.println("Engineer design method: " + str);
	}

	@Override
	public String toString() {
		return "Engineer [trainingID=" + trainingID + ", name=" + name + ", age=" + age + "]";
	}

}

class Random {

}

interface Smarty {

}
