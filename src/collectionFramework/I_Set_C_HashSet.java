package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class I_Set_C_HashSet {

	/*
	 * Set is a collection that cannot contain duplicate elements
	 * 
	 * -if you add a duplicate set will ignore it.
	 * 
	 * -There is not index
	 * 
	 * -it is an unordered collection
	 * 
	 * most known implementations are: HashSet
	 */

	public static void main(String[] args) {

		Set<Integer> hashSetList = new HashSet<>();
		hashSetList.add(19);
		hashSetList.add(12);
		hashSetList.add(16);
		hashSetList.add(17);
		hashSetList.add(12);
		hashSetList.add(11);
		hashSetList.add(13);
		hashSetList.add(14);
		hashSetList.add(15);

		Set<Person> person = new HashSet<>();
		person.add(new Person("Alan", 23));
		person.add(new Person("Alan", 23));
		person.add(new Person("Meme", 23));

		System.out.println(person.size());//2
		System.out.println(person.toString());//[Person [name=Alan, age=23], Person [name=Meme, age=23]]
	}
	
	public static void hashSetMethods(Set<Integer> hashSetList) {
		System.out.println(hashSetList); // [16, 17, 19, 11, 12, 13, 14, 15]

		Iterator<Integer> iterate = hashSetList.iterator();
		while (iterate.hasNext()) {
			Integer num = iterate.next();
			if (num >= 14) {
				iterate.remove();
			} else {
				System.out.println(num); // 11,12,13
			}
		}
		System.out.println(hashSetList); // [11, 12, 13]

		hashSetList.remove(Integer.valueOf(13));
		System.out.println(hashSetList); // [11, 12]

		iterate = hashSetList.iterator();
		while (iterate.hasNext()) {
			Integer num = iterate.next();
			if (num >= 12) {
				iterate.remove();
			} else {
				System.out.println(num); // 11
			}
		}
	}
}

class Person {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.name.equals(p.name) && this.age == p.age;
	}

	@Override
	public int hashCode() {
		return 100;
	}
}
