package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortObjects_Comparable {

	/*
	 * when we use sort to sort a list of Strings or numbers we can simply use the
	 * sort method without making any change to it
	 * 
	 * to be able to compare and sort a list of objects we can write our own
	 * implementation of sort method.
	 * 
	 * to have our own implementation of sort method we can do the next:
	 * 
	 * our class should implements Comparable interface.->class Human implements
	 * Comparable<>
	 * 
	 * type injection: we should add type of object we are trying to compare when
	 * implementing Comparable -> class Human implements Comparable<Human>
	 * 
	 * after that we should implement compareTo() abstract method from Comparable.
	 * where we should specify the object type we are trying to compare. -> public
	 * int compareTo(Human human)
	 * 
	 * compareTo() Compares current class object with the specified object for order
	 * 
	 * now sort method should sort as specified in our overridden version of
	 * compareTo() method
	 */

	public static void main(String[] args) {

		List<Human> humanList = new ArrayList<>();

		humanList.add(new Human("Alan", 28));
		humanList.add(new Human("Mark", 26));
		humanList.add(new Human("alan", 21));
		humanList.add(new Human("Kim", 24));
		humanList.add(new Human("1Lou", 23));
		humanList.add(new Human("Mark", 24));

		Collections.sort(humanList);
		System.out.print(humanList);

	}
}

class Human implements Comparable<Human> {

	String name;
	int age;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*
	 * this version written by me sorts by lexicographic order and if there are 2
	 * Strings that are the same then the one with the smaller number will come
	 * first
	 */
	@Override
	public int compareTo(Human human) {

		if (this.name.equals(human.name)) {
			return this.age - human.age;
		}
		return this.name.compareTo(human.name);
		// [Human [name=1Lou, age=23], Human [name=Alan, age=28], Human [name=Kim,
		// age=24], Human [name=Mark, age=24], Human [name=Mark, age=26], Human
		// [name=alan, age=21]]
	}

	/*
	 * this is the version given by compiler does not seem to sort my list
	 */
//	@Override
//	public int compareTo(Human o) {
//		return 0;
//		// [Human [name=Alan, age=28], Human [name=Mark, age=26], Human [name=alan,
//		// age=21], Human [name=Kim, age=24], Human [name=1Lou, age=23], Human
//		// [name=Mark, age=24]]
//	}

	/*
	 * this version written by me sorts by ascending lexicographic order.
	 */
//	@Override
//	public int compareTo(Human human) {
//		return this.name.compareTo(human.name); //ascending
//		//return human.name.compareTo(this.name); //descending

//		// [Human [name=1Lou, age=23], Human [name=Alan, age=28], Human [name=Kim,
//		// age=24], Human [name=Mark, age=26], Human [name=Mark, age=24], Human
//		// [name=alan, age=21]]
//	}

	/*
	 * this version written by me sorts by ascending numeric order. version1 and
	 * versiion2 work the same way
	 */
//	@Override
//	public int compareTo(Human human) {// this version sorts only by age
//		// return Integer.compare(this.age,human.age); //version1
//		return this.age - human.age; // version2 -- returns the distance between 2 numbers.
//		// [Human [name=alan, age=21], Human [name=1Lou, age=23], Human [name=Kim,
//		// age=24], Human [name=Mark, age=24], Human [name=Mark, age=26], Human
//		// [name=Alan, age=28]]
//	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

}