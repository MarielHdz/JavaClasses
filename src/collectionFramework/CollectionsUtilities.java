package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilities {

	/*
	 * collections is a class for common operations. Collection is an interface
	 * which defines common behavior
	 */

	public static void main(String[] args) {

		List<String> items = new ArrayList();
		items.add("one");
		items.add("two");
		items.add("one");
		items.add("three");

		System.out.println(items); // [one, two, one, three]
		Collections.sort(items);
		System.out.println(items);
		int index = Collections.binarySearch(items, "three");// [one, one, three, two]
		System.out.println(index);// 2

		/*
		 * Collections.frequency -- counts how many times an item appears in the
		 * collection
		 */

		int frequency = Collections.frequency(items, "one");
		System.out.println(frequency); // 2
	}
}
