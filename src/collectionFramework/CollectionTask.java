package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionTask {

	public static void main(String[] args) {

		duplicateNamesCount(new Scanner(System.in));
		chacactersCount("Solomo");
	}

	/*
	 * Create a frequency table using map. how many times a character is repeated in
	 * a String
	 */
	public static void chacactersCount(String str) {
		Map<Character, Integer> frequencyTable = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (!frequencyTable.containsKey(ch)) {
				frequencyTable.put(ch, 1);
			} else {
				frequencyTable.put(ch, frequencyTable.get(ch) + 1);
			}
		}
		System.out.println(frequencyTable);
	}

	/*
	 * create a Scanner object, create a list of names from user input, include few
	 * duplicates, find out How many unique elements, find out exactly how many
	 * times a name showed up.
	 */

	public static void duplicateNamesCount(Scanner keyboard) {
		Scanner sc = keyboard;
		Map<String, Integer> frequencyTable = new HashMap<>();

		System.out.println("Enter 5 names separated by enter.");
		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			if (!frequencyTable.containsKey(name)) {
				frequencyTable.put(name, 1);
			} else {
				frequencyTable.put(name, frequencyTable.get(name) + 1); // frequency.get(name) returns the value store in that key
																// "name"
			}
		}
		System.out.println(frequencyTable);
	}
}
