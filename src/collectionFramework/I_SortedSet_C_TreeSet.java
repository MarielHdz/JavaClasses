package collectionFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class I_SortedSet_C_TreeSet {
	/*
	 * SortedSet is a collection that cannot contain duplicate elements
	 * 
	 * -if you add a duplicate set will ignore it.
	 * 
	 * -There is not index
	 * 
	 * -TreeSet sorts in lexicograph order
	 * 
	 * most known implementations are: TreeSet
	 * 
	 * Note: Thanks to the fact that is sorted we have some exclusive methods like
	 * first()
	 * 
	 * Read more about comparator in:
	 * 
	 * package collectionFramework; public class SortObjects_ComparatorAndLambda
	 */

	public static void main(String[] args) {

		SortedSet<String> treeSetList = new TreeSet<>();
		treeSetList.add("Paola");
		treeSetList.add("Alana");
		treeSetList.add("paola");
		treeSetList.add("Carlos");
		treeSetList.add("paola");
		treeSetList.add("Elias");
		treeSetList.add("Paola");
		treeSetList.add("Zohan");
		treeSetList.add("zalatiel");
		treeSetList.add("1Dany");

		System.out.println(treeSetList); // [1Dany, Alana, Carlos, Elias, Paola, Zohan, paola, zalatiel]
		System.out.println(treeSetList.first()); // 1Dany
		System.out.println(treeSetList.last()); // zalatiel
		/*
		 * tailSet() returns the tail of the list starting from the argument entered.
		 * 
		 * headSet() returns everything listed before the argument excluding the
		 * argument
		 * 
		 * subSet() returns list including first argument until second argument
		 * excluding second argument
		 */
		System.out.println(treeSetList.tailSet("Zohan")); // [Zohan, paola, zalatiel]
		System.out.println(treeSetList.headSet("Zohan")); // [1Dany, Alana, Carlos, Elias, Paola]
		System.out.println(treeSetList.subSet("Carlos", "Zohan")); // [Carlos, Elias, Paola]

		/*
		 * return my list in different order using lambda Expression
		 */

		Comparator<String> orderByLastCharInName = Comparator.comparing(r -> r.charAt(r.length() - 1)); // only compares
																										// last
		// letter of each word
		// and ignore duplicates
		SortedSet<String> treeSetList2 = new TreeSet<>(orderByLastCharInName);
		treeSetList2.add("Paola");
		treeSetList2.add("Alana");
		treeSetList2.add("paola");
		treeSetList2.add("Carlos");
		treeSetList2.add("paola");
		treeSetList2.add("Elias");
		treeSetList2.add("Paola");
		treeSetList2.add("Zohan");
		treeSetList2.add("zalatiel");
		treeSetList2.add("1Dany");

		System.out.println(treeSetList2); //// [Paola, zalatiel, Zohan, Carlos, 1Dany]

		// regularOrder: // [1Dany, Alana, Carlos, Elias, Paola, Zohan, paola, zalatiel]
		// new....Order: // [Paola, zalatiel, Zohan, Carlos, 1Dany]

		Comparator<Student> compStudent = Comparator.comparing(s -> s.getId());
		SortedSet<Student> student = new TreeSet<>(compStudent);

		student.add(new Student("Alan", 3));
		student.add(new Student("Mark", 6));
		student.add(new Student("alan", 2));
		student.add(new Student("Kim", 2));
		student.add(new Student("1Lou", 1));
		student.add(new Student("Mark", 4));

		// Order:[Student [name=1Lou, id=1], Student [name=alan, id=2], Student
		// [name=Alan, id=3], Student [name=Mark, id=4], Student [name=Mark, id=6]]

		Comparator<Student> compStudent2 = Comparator.comparing(s2 -> s2.getName().charAt(0));
		SortedSet<Student> student2 = new TreeSet<>(compStudent2.reversed());

		student2.add(new Student("Alan", 3));
		student2.add(new Student("Mark", 6));
		student2.add(new Student("alan", 2));
		student2.add(new Student("Kim", 2));
		student2.add(new Student("1Lou", 1));
		student2.add(new Student("Mark", 4));

		// byNameascending: [Student [name=1Lou, id=1], Student [name=Alan, id=3],
		// Student [name=Kim, id=2], Student [name=Mark, id=6], Student [name=alan,
		// id=2]]

		// reversed:[Student [name=alan, id=2], Student [name=Mark, id=6], Student
		// [name=Kim, id=2], Student [name=Alan, id=3], Student [name=1Lou, id=1]]

		/*
		 * this list will ignore only elements that are duplicate. by duplicate in this
		 * list I mean same name and id
		 */
		Comparator<Student> compStudent3 = Comparator.comparing(s3 -> s3.getId());
		SortedSet<Student> student3 = new TreeSet<>(compStudent3.thenComparing(s3 -> s3.getName().charAt(0)));

		student3.add(new Student("Alan", 3));
		student3.add(new Student("Mark", 6));
		student3.add(new Student("alan", 2));
		student3.add(new Student("Kim", 2));
		student3.add(new Student("1Lou", 1));
		student3.add(new Student("Mark", 4));
		student3.add(new Student("Mark", 4));

		// byNameascending: [Student [name=1Lou, id=1], Student [name=Kim, id=2],
		// Student [name=alan, id=2], Student [name=Alan, id=3], Student [name=Mark,
		// id=4], Student [name=Mark, id=6]]

		// reversed:[Student [name=1Lou, id=1], Student [name=Kim, id=2], Student
		// [name=alan, id=2], Student [name=Alan, id=3], Student [name=Mark, id=4],
		// Student [name=Mark, id=6]]

		System.out.println(student3);
	}

	public static void treeSetMethods() {
		List<Long> list = new ArrayList<>();

		list.add(3L);
		list.add(15L);
		list.add(1L);
		list.add(3L);
		list.add(3L);
		list.add(5L);
		list.add(1L);

		System.out.println(list); // [3, 15, 1, 3, 3, 5, 1]
		SortedSet<Long> treeSet = new TreeSet<>(list);
		System.out.println(treeSet); // [1, 3, 5, 15]

		/*
		 * tailSet() will return a view of my original collection. if I modify my view
		 * it will affect my original item
		 */

		SortedSet<Long> treeSet2 = treeSet.tailSet(5L);// [5, 15]
		treeSet2.remove(5L); // deleted item 5 from my treeSet2 vie and this also affected my original
								// Collection. 5 was also deleted from m y treeSet
		System.out.println(treeSet2); // [15]
		System.out.println(treeSet); // [1, 3, 15]
	}
}
