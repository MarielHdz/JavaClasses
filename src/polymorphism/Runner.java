package polymorphism;

public class Runner {

	public static void main(String[] args) {

		/*
		 * is a relationship:
		 * dog is a dog 
		 * dog is a animal 
		 * dog is a mammal 
		 * everything is an object
		 */
		Dog dd = new Dog("Dubi", 5, "medium");
		Animal ad = new Dog("Deisy", 10, "tall");
		Mammal md = new Dog("Pechan", 4, "medium");
		Object od = new Dog("Black", 6, "small");

		Animal animalReferedAsAnimal = new Animal("Animal", 2);
		Dog dogReferredAsDog = new Dog("Dubi", 5, "medium");
		Animal dogReferredAsAnimal = dogReferredAsDog;
		Animal dogReferredAsAnimal2 = new Dog("Pink", 10, "tall");
		
		Cat catReferredAsCat = new Cat("toto", 1, "Fluffy");
		Animal catReferredAsAnimal = catReferredAsCat;
		
		/*
		 * METHODS
		 */

		/*************************
		 * Animal class methods 
		 * eat();
		 * toString(); //animal info to String
		 * printAnimalInfo(); //prints toString method
		 * 
		 * Dog class extends Animal
		 * methods: 
		 * bark();
		 * toString(); //Dog info to String
		 * printAnimalInfo(); //prints toString method
		 * 
		 * Cat class extends Animal
		 * methods:
		 * meow();
		 * prinAnimalInfo(); //prints toString method
		 * 
		 *************************/
		
		/*
		  At compile time: 
		  	reference type decides what you can access
			1. Compiler will check if the reference type has the method we are trying to call. 
			2. if the method is not specified there then code will not compile
	 		
	 	  At run time: 
	 	  	Object type decide what method will be invoked
		   	1. First will go to the reference type to check for the method
			2. Then it will go down to actual Object type to check if same method is overridden there
			3. If the method is overridden then the overridden version is the one that will be call.  
		 */
		
		/*
		 * Note: polymorphism is mostly used to override instance methods from a super class. There is NOT concept 
		 * of method hiding (static methods) in polymorphism if i have same static method in my reference type and 
		 * in my object type then the one in reference type will always be called.
		 */

		// animalReferedAsAnimal.barks(); //Animal type referred as Animal does not have access to Dog object methods
		dogReferredAsDog.eat(); // Dog type referred as Dog has access to Animal class methods due to inheritance and
		dogReferredAsDog.barks(); // also have access to Dog Object methods
		dogReferredAsAnimal.eat(); //Dog type referred as Animal has access only to Animal class methods (if Dog overrides any of Animal methods then the overridden version will be called)
		//dogReferredAsAnimal.barks(); //Dog type referred as Animal DON'T have access to Dog Object methods unless they are overridden
		//dogReferredAsAnimal2.barks(); //Dog type referred as Animal DON'T have access to Dog Object methods unless they are overridden
		
		
		animalReferedAsAnimal.printAnimalInfo(); //Animal [name=Animal, age=2]
		dogReferredAsDog.printAnimalInfo(); //Dog [name=Dubi, age=5, type=medium] <-print method prints toString() method which is Overridden in Dog class
		dogReferredAsAnimal.printAnimalInfo();//Dog [name=Dubi, age=5, type=medium]
		dogReferredAsAnimal2.printAnimalInfo();//Dog [name=Pink, age=10, type=tall]
		
		catReferredAsCat.printAnimalInfo();//Animal [name=toto, age=1]  <-print method prints toString() method from Animal class because is not Overridden in Cat class and
		catReferredAsAnimal.printAnimalInfo();//Animal [name=toto, age=1] //<-the name and age printed belong to the cat because printAnimalInfo() is in Cat class and pick the closest variables. 
		
		
		/*
		 * VARIABLES
		 */
		
		/*************************
		 * Animal class variables 
		 * String name;
		 * int age;
		 * 
		 * Dog class extends Animal
		 * variables: 
		 * String type;
		 * inherited: name, age
		 * 
		 * Cat class extends Animal
		 * variables:
		 * String type;
		 * inherited: name, age
		 * 
		 *************************/
		
		/*
		 *  reference type decides what you can access
			1. Compiler will check if the reference type has the variable we are trying to call. 
			2. if the variable is not specified there then code will not compile
			3.there is NOT concept of field hiding in polymorphism
				*if i have same variable in my reference type and my object type
				*the one in reference type always will be called
	 	 */
		
		System.out.println(animalReferedAsAnimal.name);    //Animal
		System.out.println(animalReferedAsAnimal.age);     //2
		System.out.println(animalReferedAsAnimal.hidden);  //hiddenAnimal
		System.out.println(dogReferredAsDog.name);         //Dubi
		System.out.println(dogReferredAsDog.age);          //5
		System.out.println(dogReferredAsDog.type);         //medium
		System.out.println(dogReferredAsDog.hidden);       //hiddenDog
		System.out.println(dogReferredAsAnimal.name);      //Dubi
		System.out.println(dogReferredAsAnimal.age);       //5
		//System.out.println(dogReferredAsAnimal.type); // there is not type variable in animal class
		System.out.println(dogReferredAsAnimal.hidden);	   //hiddenAnimal  //<-even when we have "hiddenDog" in Dog class the only visible variable is the one in reference class "hiddenAnimal"

		/*
		 * INTERFACE. ABSTRACT CLASS AND POLYMORPHISM
		 * * we can not instantiate an interface or abstract class but we can use it as reference
		 * * applies same rules than regular class
		 */
		
		Mammal m = new Animal("Animal", 4); //<-we can not instantiate Mammal but we can use it as a reference type
		System.out.println(m.EAT_PLANTS);
		System.out.println(Mammal.EAT_PLANTS);
		m.eat(); //Animal eats
		m.legNumber(); //Animal can have 2 or 4 legs
	
		
//		/*
//		 * CASTING
//		 */
//		
//		Dog animalReferresAsDogByCasting = (Dog) new Animal("Animal2", 3); //<-Casting
//		Animal dogReferredAsAnimalCastAnimal = (Animal) new Dog("Purple", 11, "short");
//		
//		/*
//		 * Casting
//		 * Animal is not a dog. here the IS A relationship does NOT apply but 
//		 * casting allows us to create this type of object
//		 */
//		animalReferresAsDogByCasting.eat();//when casting 
//		animalReferresAsDogByCasting.barks();
//		dogReferredAsAnimalCastAnimal.eat();
//		//dogReferredAsAnimalCastAnimal.barks();
	}
}
