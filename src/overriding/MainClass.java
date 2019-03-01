package overriding;

public class MainClass {

	public static void main (String [] args) {
		

		LocalStudent ls = new LocalStudent("Juan", 2, 22);
		ls.attendClass();
		OnlineStudent os = new OnlineStudent("paola", 1, 11);
		os.attendClass();
		
		/*
Output:
myMethod from LocalStudent sub-class
attending class method from LocalStudent sub-class
attending class method from Student parent class
Making friends in the class
myMethod from Student super class
attending class online using webinar
		 */
		
		System.out.println("*********************************");
		

		Student s = new Student("nena", 3);
		s.myMethod();
		LocalStudent ls2 = new LocalStudent("Juan", 2, 22);
		ls2.myMethod();
		ls2.testingFieldHiding();
		OutOfStateStudent oos = new OutOfStateStudent();
		oos.myMethod();
		
		/*
Output:
myMethod from Student super class
myMethod from Student super class
myMethod from LocalStudent sub-class
myMethod from LocalStudent sub-class
myMethod from LocalStudent sub-class
myMethod from LocalStudent sub-class
		 */
	}
}
