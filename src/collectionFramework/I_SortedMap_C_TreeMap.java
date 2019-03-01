package collectionFramework;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class I_SortedMap_C_TreeMap {

	/*
	 * SortedMap is not a collection (does not extends collection interface) but is
	 * part of collections framework
	 * 
	 * -if you add a duplicate key the map will only get the last version of that
	 * duplicated key.
	 * 
	 * -it is sorted
	 * 
	 * -There is not index
	 * 
	 * -we can get items by key
	 * 
	 * -is not iterable (doesn't implement iterable). in order to iterate we need to
	 * get a collection view of a map ( for example : put the map inside of a Set so
	 * that way we can get a Set view of a map). best way to iterate a map is
	 * entrySet(). code example is in IterateMap class
	 * 
	 * most known implementations are: TreeMap
	 * 
	 * Read more about comparator in:
	 * 
	 * package collectionFramework; public class SortObjects_ComparatorAndLambda
	 */

	public static void main(String[] args) {

		// reversing sort by using lambda expression
		Comparator<Integer> Compare = Comparator.comparing(num -> -num);
		SortedMap<Integer, String> cityMap = new TreeMap<>(Compare);

		cityMap.put(125, "Random");
		cityMap.put(123, "Spectrum");
		cityMap.put(124, "Orange");
		cityMap.put(125, "Another");
		cityMap.put(124, "Orange");

		System.out.println(cityMap);
		// default sort will print as: {123=Spectrum, 124=Orange, 125=Another}
		// my reverse logic pprints: {125=Another, 124=Orange, 123=Spectrum}

		Comparator<String> Compare2 = Comparator.comparing(str -> str);
		SortedMap<String, Integer> cityMap2 = new TreeMap<>(Compare2.reversed()); // just used reverse logic in my
																					// comparator

		cityMap2.put("C", 125);
		cityMap2.put("A", 126);
		cityMap2.put("D", 124);
		cityMap2.put("C", 125);
		cityMap2.put("B", 124);

		System.out.println(cityMap2);
		// default sort will print as: {A=126, B=124, C=125, D=124}
		// my reverse logic prints: {D=124, C=125, B=124, A=126}

		/*
		 * how do we compare an object: lets say we have: 1, 5, 6, 3, 4
		 */
		// our starting point is 1
		// from 1 to 1 the distance is 0
		// from 1 to 5 the distance is -4
		// from 1 to 6 the distance is -5
		// from 1 to 3 the distance is -2
		// from 1 to 4 the distance is -3
		// 1(0),3(-2),4(-3),5(-4),6(-5)

		/*
		 * HOW DOS THIS REVERSE LOGIC WORK: num -> -num
		 */

		// num -> num
		// our starting point is 125
		// from 125 to 125 the distance is 0
		// from 125 to 123 the distance is 2
		// from 125 to 124 the distance is 1
		// from 125 to 125 the distance is 0
		// from 125 to 124 the distance is 1
		// 123(2), 124(1), 125(0)

		// num -> -num //will make them negative
		// our starting point is 125
		// from 125 to 125 the distance is 0
		// from 125 to 123 the distance is -2
		// from 125 to 124 the distance is -1
		// from 125 to 125 the distance is 0
		// from 125 to 124 the distance is -1
		// 125(0), 124(-1), 123(-2)
	}
}
