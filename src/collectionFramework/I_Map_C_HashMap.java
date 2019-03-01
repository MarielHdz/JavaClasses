package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class I_Map_C_HashMap {

	/*
	 * Map is not a collection (does not extends collection interface) but is part
	 * of collections framework
	 * 
	 * -if you add a duplicate key the map will only get the last version of that
	 * duplicated key.
	 * 
	 * -it is unordered
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
	 * most known implementations are: HashMap
	 * 
	 * to be able to implement our own sort method our class should implements
	 * Comparable interface and add implementation for compareTo() method. more
	 * examples in SortObjects class
	 */

	public static void main(String[] args) {

		Map<Integer, String> cityMap = new HashMap<>();
		cityMap.put(123, "Spectrum");
		cityMap.put(124, "Orange");
		cityMap.put(125, "another");

		System.out.println(cityMap); // {123=Spectrum, 124=Orange, 125=another}
		System.out.println(cityMap.values()); // [Spectrum, Orange, another]
		System.out.println(cityMap.entrySet()); // [123=Spectrum, 124=Orange, 125=another]

		// iterate city map 1
		Set<Integer> cityMapView = cityMap.keySet(); // this gives me a set view of my keys
		Iterator<Integer> iterate = cityMapView.iterator();

		while (iterate.hasNext()) {
			System.out.print(iterate.next() + " "); // 123 124 125
		}
		System.out.println();

		// iterate city map 2
		Set<Entry<Integer, String>> sortedCityMap = cityMap.entrySet();
		for (Entry<Integer, String> e : sortedCityMap) {
			System.out.print(e.getKey() + " " + e.getValue() + " "); // 123 Spectrum 124 Orange 125 another
		}

	}

	public static void practice1() {
		/*
		 * storing single values: [soccer, basketball, pingpong]
		 * 
		 * storing key-value pair: [ {1:soccer}, {2:basketball}]
		 */

		Map<Integer, String> map = new HashMap<>();

		map.put(3, "pingpong");
		map.put(1, "soccer");
		map.put(2, "basketball");
		map.put(2, "tennis"); // map will only get the last version of the duplicated element

		System.out.println(map); // {1=soccer, 2=tennis, 3=pingpong}
		System.out.println(map.get(2)); // tennis

		// check if a key exist in a map

		System.out.println(map.containsKey(1)); // true
		System.out.println(map.containsKey(4)); // false

		System.out.println(map.containsValue("tennis")); // true
		System.out.println(map.containsValue("basketball")); // false

		// counting items in a map

		System.out.println(map.size()); // 3

		// remove an item

		map.remove(1);
		System.out.println(map); // {2=tennis, 3=pingpong}

		map.remove(3, "pingpo"); // will remove element only if key and value match
		System.out.println(map); // {2=tennis, 3=pingpong}
	}

	public static void practice2() {
		Map<Double, String> map2 = new HashMap<>();

		map2.put(3.1, "Math");
		map2.put(3.2, "Spanish");
		map2.put(3.3, "Biology");
		map2.put(3.2, "Geography");
		System.out.println(map2);// {3.2=Geography, 3.1=Math, 3.3=Biology}

		/*
		 * getOrDefault()--if the key does not exist then it will print default
		 */
		System.out.println(map2.getOrDefault(3.5, "History")); // this key is not present

		map2.replace(3.2, "random");
		System.out.println(map2);// {3.2=random, 3.1=Math, 3.3=Biology}
		map2.replace(3.2, "rand", "Pao"); // will replace element only if key and value match
		System.out.println(map2);// {3.2=random, 3.1=Math, 3.3=Biology}

		map2.putIfAbsent(3.4, "Science");
		System.out.println(map2);// {3.2=random, 3.1=Math, 3.4=Science, 3.3=Biology}
	}

	public static Map<String, String> topping2(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));
		}
		map.replace("spinach", "nuts");
		return map;
	}

	/*
	 * Given a map of food keys and topping values, modify and return the map as
	 * follows: if the key "ice cream" is present, set its value to "cherry". In all
	 * cases, set the key "bread" to have the value "butter".
	 */
	public Map<String, String> topping1(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.replace("ice cream", "cherry");
		}
		map.put("bread", "butter");

		return map;
	}

	/*
	 * 
	 * Modify and return the given map as follows: for this problem the map may or
	 * may not contain the "a" and "b" keys. If both keys are present, append their
	 * 2 string values together and store the result under the key "ab".
	 */
	public static Map<String, String> mapAB(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}
		return map;
	}

	/*
	 * 
	 * Modify and return the given map as follows: if the key "a" has a value, set
	 * the key "b" to have that value, and set the key "a" to have the value "".
	 * Basically "b" is a bully, taking the value and replacing it with the empty
	 * string.
	 */

	public static Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}
}
