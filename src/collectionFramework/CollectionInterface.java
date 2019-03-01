package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class CollectionInterface {

	public static void main(String[] args) {

		/*
		 * collections interface provide guidelines for all other collections.
		 * 
		 * this is the parent interface.
		 * 
		 * contains the general methods that subclasses should implement
		 */
		
		Collection<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list.toString()); // [1, 2, 3, 4, 5]

		list.remove(0);
		list.remove(0);
		System.out.println(list.toString());// [3, 4, 5]

		list.remove(new Integer(4));
		System.out.println(list.toString());// [3, 5]

		List<Integer> ls1 = Arrays.asList(11, 12);
		System.out.println(ls1); // [11, 12]

		list.addAll(ls1);
		System.out.println(list.toString());// [3, 5, 11, 12]

		list.removeAll(ls1);
		System.out.println(list.toString());// [3, 5]

		list.addAll(ls1);
		System.out.println(list.toString());// [3, 5, 11, 12]

		list.retainAll(ls1);
		System.out.println(list.toString());// [11, 12]

	}
}
