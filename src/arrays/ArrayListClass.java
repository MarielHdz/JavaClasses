package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {

		printingArrayList();
		
	}
	
	public static void argumentsAndAutoboxing() {
		ArrayList<Integer> arr = new ArrayList<>(); // <-this array is expecting a Integer object

		Integer num = new Integer(3);
		arr.add(num); // <- we can pass it by explicitly creating an Integer object

		arr.add(3); // <- or we can pass it directly through auto-boxing (converting a primitive
					// type into a wrapper)
	}
	
	public static void printingArrayList() {
		ArrayList<String> arr2 = new ArrayList<>();

		arr2.add("Paola");
		arr2.add("John");

		for (int i = 0; i < arr2.size(); i++) {
			System.out.print(arr2.get(i) + " "); //Paola John 
		}

		System.out.println();
		
		for (String str : arr2) {
			System.out.print(str + " ");  //Paola John 
		}
	}
	
	/*
	 * We can insert an element into an specific location
	 */
	public static void specifyIndexToAddElementsToList() {
		ArrayList<String> arr = new ArrayList<>(); 

		arr.add("Paola");
		arr.add("John");
		System.out.println(arr); //[Paola, John]
		
		arr.add(0,"Polis"); 
		System.out.println(arr); //[Polis, Paola, John]
	}

	/*
	 * Clear method deletes everything in an array
	 */
	public static void clearMethod() {
		ArrayList<String> arr = new ArrayList<>(); 

		arr.add("Paola");
		arr.add("John");
		arr.add("Loo");
		System.out.println(arr); //[Paola, John, Loo]
		arr.clear();
		System.out.println(arr); //[]
	}
	
	/*
	 * Create an array list of String add 5 names using Scanner to ArrayList object
	 * then print out using loop
	 */
	public static void printNamesFromList() {

		ArrayList<String> name = new ArrayList<>();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 5 different names separated by space");
		
		//Create an array list of String add 5 names using Scanner to ArrayList object
		for ( int i = 0; i<5; i++) {
			name.add(keyboard.next());
		}
		
		//print ArrayList using loop
		for(String n : name) {
			System.out.print(n + " ");
		}		
	}
	
	public static void moreMethods() {
		//find first and last index position of an specific item in the list
		ArrayList <String> lst = new ArrayList<>();
		lst.add("Alan");
		lst.add("Pan");
		lst.add("Leno");
		lst.add("Alan");
		lst.add("John");		
		
		//print ArrayList using loop
		for(String n : lst) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		//print first and last letter of each name
		for(String n : lst) {
			char ch1 = n.charAt(0);
			char ch2 = n.charAt(n.length() - 1);
			System.out.print("" + ch1 + ch2 + " "); //<- had to add empty "" to convert to String because if i print only ch1 + ch2 it will print the addition result instead of characteres
		}
		
		System.out.println();

		//find an specific item from the list
		String target = "Alan";
		boolean foundName = lst.contains(target);
		System.out.println("Item " + target + " is found in the list: " + foundName );
		
		System.out.println("First index of list is " + lst.indexOf("Alan"));
		System.out.println("Last index of list is " + lst.lastIndexOf("Alan"));
		
		/*
		 * The main difference between set and add is 
		 * Set will replace an item in an specific index
		 * add will insert the item and shuffle the rest to the next index position
		 */
		
		//insert an item in an specific position
		System.out.println(lst); //[Alan, Pan, Leno, Alan, John]
		lst.add(0, "Pao");
		System.out.println(lst); //[Pao, Alan, Pan, Leno, Alan, John]
		
		//set an item in an specific position
		System.out.println(lst); //[Pao, Alan, Pan, Leno, Alan, John]
		lst.set(2, "Pao");
		System.out.println(lst); //[Pao, Alan, Pao, Leno, Alan, John]
	}


}






















