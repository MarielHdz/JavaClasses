package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorPractice {

	/*
	 * safest way to iterate and remove an element in a collection is Iterator.
	 */

	public static void main(String[] args) {
		Collection<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(130);
		list.add(140);
		list.add(15);

		Iterator<Integer> iterate = list.iterator();
		System.out.println(iterate.hasNext());// true
		System.out.println(iterate.next()); // 11
		System.out.println(iterate.next()); // 12
		System.out.println(list);// [11, 12, 130, 140, 15]
		iterate.remove(); // iterator was position on 12 so it deleted 12
		System.out.println(list); // [11, 130, 140, 15]

		System.out.println("****************************************");

		while (iterate.hasNext()) {
			if (iterate.next() > 100) {
				iterate.remove();
			}
		}
		System.out.println(list); // 11,15
	}
}
