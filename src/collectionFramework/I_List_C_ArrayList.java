package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class I_List_C_ArrayList {

	/*
	 * List is an ordered collection, may contain duplicates.
	 * 
	 * -whatever you add first go first in the index position hence you can get an
	 * element by index with: listName.get();
	 * 
	 * -if you remove something then following elements move back to occupy the
	 * newly empty index(es)
	 * 
	 * most known implementations are: ArrayList, LinkedList *
	 */

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		List<String> items = new ArrayList<>();
		items.add("one");
		items.add("two");
		items.add("one");
		items.add("three");

		removeDuplicate2(items);
	}

	/*
	 * remove duplicate element from a list
	 */

	public static void removeDuplicate(List<String> list) {
		//fastest way is using constructor
		Set<String> set = new HashSet<>(list);
		System.out.println(list);
		System.out.println(set);
	}

	public static void removeDuplicate2(List<String> list) {

		Set<String> set = new HashSet<>();

		for (int i = 0; i < list.size(); i++) {
				set.add(list.get(i));
		}
		System.out.println(list);
		System.out.println(set);
	}

	/*
	 * write a program that reads 3 non negative int from the keyboard display the
	 * integers in increasing order
	 */
	public static void increasingOrder() {
		System.out.println("Enter 3 numbers separated by a space: ");
		ArrayList<Integer> increasingOrder = new ArrayList<Integer>();

		increasingOrder.add(sc.nextInt());
		increasingOrder.add(sc.nextInt());
		increasingOrder.add(sc.nextInt());

		// ascending
		Collections.sort(increasingOrder);
		System.out.println(increasingOrder);

		// descending
		Comparator<Integer> com = Collections.reverseOrder();
		Collections.sort(increasingOrder, com);
		System.out.println(increasingOrder);
	}

}
