package final_keyword;

public class FinalVariables {

	int K;
	static long j;
	
	public static void main(String[] args) {
		/*
		 * A final variable can not be changed. 
		 */
		
		final int num;
		num = 18;
		
		final int i =12;
		//i = 12;  // <- compile error because A final variable can not be reAssigned
		
		final String name = "Paola";
		//name  = "Ana"; //// <- compile error because A final variable can not be reAssigned
		
		final double price = 12.5;
		//price = 9.5; // <- compile error because A final variable can not be reAssigned
		
		final StringBuilder sb = new StringBuilder("Alan");
		//sb = new StringBuilder("Nancy"); // <- compile error because A final variable can not be reAssigned

		final String word = "Paola";
		String newWord = word;
		newWord = "anotherNewWord"; //<- we can change the String newWord because is a non-final copy of the final String word

		
	}
}
