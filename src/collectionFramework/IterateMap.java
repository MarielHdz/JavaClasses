package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {

	/*
	 * entrySet() returns a set view of the mappings contained in this map, whose
	 * elements are of Entry class. The <i>only</i> way to obtain a reference to a
	 * map entry is from the iterator of this collection-view.
	 * 
	 * I can see the entries stored in the hash by using methods like getKey() and
	 * getValue()
	 */

	public static void main(String[] args) {

		entrySetIterator(); /*
							 * ProductOwner Fairfax, DBA Herndon, ScrumMaster DC, SDET Vienna, MannualTester
							 * Fairfax
							 */
		
		
	}

	//recommended way to iterate a map
	public static void entrySetIterator() {

		Map<String, String> map = new HashMap<>();

		map.put("SDET", "Vienna");
		map.put("MannualTester", "Fairfax");
		map.put("DBA", "Herndon");
		map.put("ScrumMaster", "Reston");
		map.put("ProductOwner", "Fairfax");
		map.put("ScrumMaster", "DC");

		System.out.println(map.entrySet());// [ProductOwner=Fairfax, DBA=Herndon, ScrumMaster=DC, SDET=Vienna,
											// MannualTester=Fairfax]

		Set<Entry<String, String>> entries = map.entrySet();

		for (Entry<String, String> e : entries) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	public static void looping2() {
		Map<String, String> map = new HashMap<>();

		map.put("SDET", "Vienna");
		map.put("MannualTester", "Fairfax");
		map.put("DBA", "Herndon");
		map.put("ScrumMaster", "Reston");
		map.put("ProductOwner", "Fairfax");
		map.put("ScrumMaster", "DC");

		System.out.println(map);// {ProductOwner=Fairfax, DBA=Herndon, ScrumMaster=DC, SDET=Vienna,
								// MannualTester=Fairfax}

		Set<String> keys = map.keySet();// Returns a Set view of the keys contained in this map.
		System.out.println(keys); // [ProductOwner, DBA, ScrumMaster, SDET, MannualTester]

		Iterator<String> iterate = keys.iterator();

		while (iterate.hasNext()) {
			System.out.print(iterate.next() + " ");// ProductOwner DBA ScrumMaster SDET MannualTester
		}

		System.out.println();
		System.out.println(map.values());// [Fairfax, Herndon, DC, Vienna, Fairfax]

		// iterate rhrough values

		Collection<String> allValues = map.values();
		Iterator<String> iterate2 = allValues.iterator();

		while (iterate2.hasNext()) {
			System.out.print(iterate2.next() + " ");// Fairfax Herndon DC Vienna Fairfax
		}
	}
}
