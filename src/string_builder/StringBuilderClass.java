package string_builder;

public class StringBuilderClass {

/*
 * There are 4 ways (constructors) to create a String builder
 */
	public static void main (String[] args) {
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();
		StringBuilder sb5 = new StringBuilder();
		StringBuilder sb6 = new StringBuilder();	
		//StringBuilder sb7 = new StringBuilder();	


		sb.append("I ").append("LOVE ").append(5).append(" FRIENDS BECAUSE THEY ARE ").append(true).append('!');
		
		//print sb as a StringBuilder. this will have access to StringBuilder methods and not to methods from string class
		System.out.println(sb); 				//I LOVE 5 FRIENDS BECAUSE THEY ARE true!
		System.out.println(sb.delete(7, 9)); 	//I LOVE FRIENDS BECAUSE THEY ARE true!
		System.out.println(sb.deleteCharAt(7)); //I LOVE RIENDS BECAUSE THEY ARE true!


		//print sb2 as a String this will have access to all methods from string class and not from StringBuilder class
		sb2.append("I ").append("LOVE ").append(5).append(" FRIENDS BECAUSE THEY ARE ").append(true).append('!');
		System.out.println(sb2.toString()); //I LOVE 5 FRIENDS BECAUSE THEY ARE true!
		//System.out.println(sb2.delete(7, 9)); //syntax error because String class does not have delete method

		/*
		 * length method 
		 */
		
		sb3.append("I ").append("love ").append("my family").append('!');
		System.out.println(sb3); 				//I love my family!
												//I love my  f a m i l y !   //I had to separate  the word family in order to count the characters in sb3 
												//1234567891011121314151617  //length method starts from one
		System.out.println(sb3.length()); 		//17
		
		/*
		 * setLength method:
		 * 1- will set the space that will be saved in the computer 
		 */
		
		//example 1: if we have sb4 which length is = 17  and we set sb4 length to 9 then sb4 length should be = 9.
		sb4.append("I ").append("love ").append("my family").append('!'); //I love my family!
		System.out.println(sb4.length());  		//17
		sb4.setLength(9);
		System.out.println(sb4.length());  		//9
		System.out.println(sb4); 				//I love my
												//123456789
		
		
		/*
		 * example 2: if we have sb5 which length is = 6  and we set sb5 length to 9 then sb5 length should be = 9 even if there
		 * are only 6 characters in my sentence.
		 */
		sb5.append("I ").append("love");
		System.out.println(sb5.length());  		//6
		sb5.setLength(9);
		System.out.println(sb5.length());  		//9
		System.out.println(sb5); 				//I love
												//123456789
		
		sb5.append("me");
		System.out.println(sb5);				//I love   me
												//1234567891011
		System.out.println(sb5.length());  		//11
		
		sb5.append("!");
		System.out.println(sb5);				//I love   me!
												//123456789101112
		System.out.println(sb5.length());  		//12

		/*
		 * insert method
		 */
		sb6.append("I ").append("me ").append("so");
		System.out.println(sb6);							//I me so
		System.out.println(sb6.length());					//7
		//sb6.insert(2, "love ");  //or
		sb6.insert(sb6.indexOf("me"), "love ");
		System.out.println(sb6);							//I love me so
		System.out.println(sb6.length());					//12
		
		//insert method will will take the first appearance of the mentioned index
		//eg: following sentence has more than one blank space but the asterisk will only be added in the first appearance
		sb6.insert(sb6.indexOf(" "), " *");
		System.out.println(sb6);							//I * love me so
		System.out.println(sb6.length());					//14

		/*
		 * insert the word hard before the word and
		 * replace I with your name
		 * insert "your name will" before the word get
		 */
		
		StringBuilder sb7 = new StringBuilder();	

		sb7.append("I will study and get certified");
		sb7.replace(sb7.indexOf("I"), sb7.indexOf(" "), "Paola");
		sb7.insert(sb7.indexOf("and"), "hard ");
		sb7.insert(sb7.indexOf("get"), "Paola will ");

		System.out.println(sb7);  //Paola will study hard and Paola will get certified
		System.out.println(sb7.reverse()); //deifitrec teg lliw aloaP dna drah yduts lliw aloaP


		
		
		
		
		
	}
}
