package casting;

public class Instanceof {

	public static void main(String[] args) {

		/*
		 * compile time: -checks for relationship -checks reference type
		 * 
		 * run time: -check if object type IS A reference type (IS A relationship) -if
		 * false we will get "ClassCastExeption"
		 */


		/*
		 * Use Instanceof operator before downcasting to check if the object belongs
		 * to the specific type.
		 */
		
		System.out.println("Use Instanceof operator before downcasting \nto check if the object belongs to the specific type.\n");
		Object object = new Person("Pao", 31);
		Person p;
		if(object instanceof Person) {//true
			p = (Person) object;
			System.out.println("downcast succesful"); 
		}else {
			System.out.println("downcast unsuccesful");
		}

		Object object2 = new Object();
		if(object2 instanceof Person) {//false
			p = (Person) object2;
			System.out.println("downcast succesful");
		}else {
			System.out.println("downcast unsuccesful");
		}
		
		
		Engineer engineer = new Engineer("ing", 40, 123);
		Person person = new Person("Omar", 34);
		Smarty interface_ = new Engineer("Eng", 45, 321);
		

		System.out.println("\ninstanceof operator checks for compatibility\n");
		System.out.println("engineer is an Engineer:  " + (engineer instanceof Engineer));//true 
		System.out.println("engineer extends Person:  " + (engineer instanceof Person));//true
		System.out.println("object is the parent type of all objects:  " + (engineer instanceof Object));//true
		System.out.println("engineer implements Smarty:  " + (engineer instanceof Smarty));//true
		
		System.out.println("person extends Engineer:  " + (person instanceof Engineer));//false
		System.out.println("object extends Engineer:  " + (object instanceof Engineer));//false
		
		/*
		 * following lines will give run time: ClassCastExeption even if code is
		 * compiling because object type IS NOT a reference type (there is not a IS A relationship)
		 */

//		((Engineer) person).design("designing 2"); //person is not an engineer
//		Engineer e1 = (Engineer) person; 
//		e1.design("designing 3");
//		Person p1 = (Person) person; 
//		p1.getName();
//		Engineer e2 = (Engineer) new Person("Ana", 19); 
//		e2.design("designing 4");
//		Person p2 = (Person) new Object(); 
//		p2.getName();
	}
}
