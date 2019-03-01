package exercises;

import java.util.ArrayList;

public class Z7_MyStringToolBox {

	String targetString;

	public Z7_MyStringToolBox() {

	}

	public Z7_MyStringToolBox(String targetString) {
		this.targetString = targetString;
	}

	public int calculateSum() {
		int sum = 0;

		for (char ch : targetString.toCharArray()) {
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}


	/*
	 * isAlphabetic(x) method is useful to filter letters from symbols and numbers
	 */
	public ArrayList<Character> getList() {
		ArrayList<Character> list = new ArrayList<>();
		for (char ch : targetString.toCharArray()) {
			if(Character.isAlphabetic(ch)) {
				list.add(ch);
			}
		}
		return list;
	}
}
