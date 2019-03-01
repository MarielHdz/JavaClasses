package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortObjects_ComparatorAndLambda {

	/*
	 * there will be times when we wont have access to the class of the object we
	 * are working with and wont be able to implement comparable interface. in this
	 * case we can use Comparator:
	 * 
	 * There is a version of sort from collections that accepts a comparator:
	 * Collections.sort(WhtrUComparigEg.ListName,comparatrGoesHereEg.ClassOrLambda);
	 * We can use it to sort by whatever we need to.
	 * 
	 * There are 2 ways to use comparator:
	 * 
	 * 1. You should create a new class implementing Comparator then implement
	 * compare method from Comparator interface. you should not implement Comparator
	 * in your working class. after that instantiate a Comparator by using a
	 * subclass(the one you just created) and then use the Collections.sort() that
	 * accepts a comparator as argument
	 *
	 * 2. Another option is Lambda Expression. you can use Comparator<Student>
	 * comparatorById = Comparator.comparing(s -> sortThisWay) and then use it with:
	 * 
	 * -Collections.sort() that accepts a comparator as argument
	 * 
	 * -SortedSet<String> treeSetList2 = new TreeSet<>(orderByLastCharInName);
	 * treeSet constructor accepts a comparator as argument
	 * 
	 * -SortedMap<String, Integer> cityMap2 = new TreeMap<>(Compare2); TreeMap
	 * constructor accepts a comparator as argument
	 */
	public static void main(String[] args) {

		List<Student> student = new ArrayList<>();

		student.add(new Student("Alan", 4));
		student.add(new Student("Mark", 6));
		student.add(new Student("alan", 2));
		student.add(new Student("Kim", 5));
		student.add(new Student("1Lou", 1));
		student.add(new Student("Mark", 4));

		Comparator<Student> studentIdComparator = new IdComparator();
		Collections.sort(student, studentIdComparator); // <-this version of sort accepts a Comparator
		System.out.println(student);
		// [Student [name=1Lou, id=1], Student [name=alan, id=2], Student [name=Alan,
		// id=3], Student [name=Mark, id=4], Student [name=Kim, id=5], Student
		// [name=Mark, id=6]]

		Comparator<Student> studentNameComparator = new NameComparator();
		Collections.sort(student, studentNameComparator); // <-this version of sort accepts a Comparator
		System.out.println(student);
		// [Student [name=alan, id=2], Student [name=Mark, id=4], Student [name=Mark,
		// id=6], Student [name=Kim, id=5], Student [name=Alan, id=3], Student
		// [name=1Lou, id=1]]

		Comparator<Student> bothComparator = studentIdComparator.thenComparing(studentNameComparator);
		Collections.sort(student, bothComparator);
		System.out.println(student);
		// [Student [name=1Lou, id=1], Student [name=alan, id=2], Student [name=Alan,
		// id=4], Student [name=Mark, id=4], Student [name=Kim, id=5], Student
		// [name=Mark, id=6]]

		/*
		 * Lambda Expression
		 */

		Comparator<Student> comparatorByName = Comparator.comparing(s -> s.getName());
		Collections.sort(student, comparatorByName);
		System.out.println(student);
		// [Student [name=1Lou, id=1], Student [name=Alan, id=4], Student [name=Kim,
		// id=5], Student [name=Mark, id=4], Student [name=Mark, id=6], Student
		// [name=alan, id=2]]
		Collections.sort(student, comparatorByName.reversed());
		System.out.println(student);
		// [Student [name=alan, id=2], Student [name=Mark, id=4], Student [name=Mark,
		// id=6], Student [name=Kim, id=5], Student [name=Alan, id=4], Student
		// [name=1Lou, id=1]]

		Comparator<Student> comparatorById = Comparator.comparing(s -> s.getId());
		Collections.sort(student, comparatorById);
		System.out.println(student);
		// [Student [name=1Lou, id=1], Student [name=alan, id=2], Student [name=Alan,
		// id=4], Student [name=Mark, id=4], Student [name=Kim, id=5], Student
		// [name=Mark, id=6]]
	}
}

class Student {

	String name;
	int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
}

class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}
}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}