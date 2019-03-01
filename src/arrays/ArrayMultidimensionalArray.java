package arrays;

import java.util.Arrays;

public class ArrayMultidimensionalArray {

	public static void main(String[] args) {

		exercises();
	}

	/*
	 * 1. Declare a 4 dimensional int array variable called fourD 2. Declare a 3
	 * dimensional long array called threeD. initialize the object with 1st
	 * dimension 4 items , 2nd dimension 3 items, 3rd dimension 2 items 3. Declare a
	 * 2 dimensional double array called priceTags. it should store 4 set of price
	 * tags as double array for each item 1st 2 set have 4 price tag, last one have
	 * only 1 price tag print out every price tag format: 1st level have x items and
	 * prices are 1.1, 2.2, 333....
	 * 
	 */

	public static void exercises() {
		// Declare a 4 dimensional int array variable called fourD

		int[][][][] fourD;

		// 2. Declare a 3 dimensional long array called threeD. initialize the object
		// with 1st
		// dimension 4 items , 2nd dimension 3 items, 3rd dimension 2 items
		long[][][] threeD = new long[4][3][2];

		/*
		 * 3. Declare a 2 dimensional double array called priceTags. it should store 3
		 * set of price tags as double array for each item first 2 set have 4 price tag,
		 * last one have only 1 price tag print out every price tag format: 1st level
		 * have x items and prices are 1.1, 2.2, 333....
		 */

//		double[][] priceTags = new double[3][];

		double[] set1 = { 10 }, set2 = { 20, 25.5, 21, 2.5 }, set3 = { 30 };
		double[][] priceTags = { set1, set2, set3 };

		for (int i = 0; i < priceTags.length; i++) {
			if (i == 0) {
				if (priceTags[i].length == 1) {
					System.out.print("1st level have " + priceTags[i].length + " item and price is: ");
				} else {
					System.out.print("1st level have " + priceTags[i].length + " items and prices are: ");
				}
				for (int j = 0; j < priceTags[i].length; j++) {
					System.out.print(priceTags[i][j]);
					if (j < priceTags[i].length - 1) {
						System.out.print(", ");
					}
				}
				System.out.println();
			} else {
				if (priceTags[i].length == 1) {
					System.out.print("2nd level have " + priceTags[i].length + " item and price is: ");
				} else {
					System.out.print("2nd level have " + priceTags[i].length + " items and prices are: ");
				}
				for (int j = 0; j < priceTags[i].length; j++) {
					System.out.print(priceTags[i][j]);
					if (j < priceTags[i].length - 1) {
						System.out.print(", ");
					}
				}
				System.out.println();
			}
		}
	}

	public static void books() {
		String[][] books = new String[3][3];
		books[0][0] = "book1";
		books[0][1] = "author1";
		books[0][2] = "romantic";

		books[1][0] = "book2";
		books[1][1] = "author2";
		books[1][2] = "comedy";

		books[2][0] = "book3";
		books[2][1] = "author3";
		books[2][2] = "romantic";

		// Are there books where genre = comedy

		for (String[] book : books) {
			for (String element : book) {
				if (element.equals("comedy")) {
					System.out.println("found");
				}
			}
		}
	}

	public static void warmUp3() {

		String[][] pizzaArry = { { "Mushroom", "Black Olive", "Green Pepper" },
				{ "Spinach", "Green Pepper", "Mushroom" }, { "Black Olive", "Black Olive", "Spinach" },
				{ "Mushroom", "Mushroom", "Red Pepper" }, { "Banana Pepper", "Spinach", "Red Pepper" },
				{ "Mushroom", "Green Pepper", "Green Pepper" }, { "Spinach", "Green Pepper", "Mushroom" } };

		// when printing ignore black olive
		for (int i = 0; i < pizzaArry.length; i++) {
			System.out.print("Slice " + (i + 1) + " toppings are: ");
			for (int j = 0; j < pizzaArry[i].length; j++) {
				if (pizzaArry[i][j].equals("Black Olive")) {
					continue;
				}
				System.out.print(pizzaArry[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void warmUp2() {

		String[][] pizzaArry = { { "Mushroom", "Black Olive", "Green Pepper" },
				{ "Spinach", "Green Pepper", "Mushroom" }, { "Black Olive", "Black Olive", "Spinach" },
				{ "Mushroom", "Mushroom", "Red Pepper" }, { "Banana Pepper", "Spinach", "Red Pepper" },
				{ "Mushroom", "Green Pepper", "Green Pepper" }, { "Spinach", "Green Pepper", "Mushroom" } };

		// each loop
		for (String[] pizza : pizzaArry) {
			for (String ingredient : pizza) {
				System.out.print(ingredient + " "); // Mushroom Black Olive Green Pepper Spinach Green Pepper Mushroom
													// Black Olive Black Olive Spinach Mushroom Mushroom Red Pepper
													// Banana Pepper Spinach Red Pepper Mushroom Green Pepper Green
													// Pepper Spinach Green Pepper Mushroom
			}
		}
		System.out.println();

		// for loop
		for (int i = 0; i < pizzaArry.length; i++) {
			System.out.print("Slice " + (i + 1) + " ingredients are: ");
			for (int j = 0; j < pizzaArry[i].length; j++) {
				System.out.print(pizzaArry[i][j] + "  ");
			}
			System.out.println();
		}
		/*
		 * output from above method: Slice 1 ingredients are: Mushroom Black Olive Green
		 * Pepper Slice 2 ingredients are: Spinach Green Pepper Mushroom Slice 3
		 * ingredients are: Black Olive Black Olive Spinach Slice 4 ingredients are:
		 * Mushroom Mushroom Red Pepper Slice 5 ingredients are: Banana Pepper Spinach
		 * Red Pepper Slice 6 ingredients are: Mushroom Green Pepper Green Pepper Slice
		 * 7 ingredients are: Spinach Green Pepper Mushroom
		 */
	}

	/*
	 * Create 2 dimensional array [7][3] assign a value for each item print value in
	 * format: <num>: bite<1,2,3>
	 */
	public static void warmUp1() {

		// int [][] pizzaArry = new int[7][3]; //<- this way I have to add each item
		// using add()

		int[][] pizzaArry = { { 0, 1, 2 }, { 10, 11, 12 }, { 20, 21, 22 }, { 30, 31, 32 }, { 40, 41, 42 },
				{ 50, 51, 52 }, { 10, 11, 12 } };

//		System.out.println(pizzaArry.length); //7
//		System.out.println(pizzaArry[1].length); //3		
//		System.out.println(pizzaArry[3][2]); //32

		for (int i = 0; i < pizzaArry.length; i++) {
			System.out.print("Slice <" + (i + 1));
			for (int j = 0; j < pizzaArry[i].length; j++) {
				System.out.print("> : <bite" + (j + 1) + ": " + pizzaArry[i][j]);
			}
			System.out.println();
		}

		/*
		 * output from above method: Slice <1> : <bite1: 0> : <bite2: 1> : <bite3: 2
		 * Slice <2> : <bite1: 10> : <bite2: 11> : <bite3: 12 Slice <3> : <bite1: 20> :
		 * <bite2: 21> : <bite3: 22 Slice <4> : <bite1: 30> : <bite2: 31> : <bite3: 32
		 * Slice <5> : <bite1: 40> : <bite2: 41> : <bite3: 42 Slice <6> : <bite1: 50> :
		 * <bite2: 51> : <bite3: 52 Slice <7> : <bite1: 10> : <bite2: 11> : <bite3: 12
		 */

		// if i use each loop
		for (int[] slice : pizzaArry) {
			for (int bite : slice) {
				System.out.print(bite);
			}
			System.out.println();
		}

		/*
		 * Output from above method: 012 101112 202122 303132 404142 505152 101112
		 */
	}

}
