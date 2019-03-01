package javaconcepts;

import java.util.Arrays;
import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
		random();
	}
	
	public static void random() {
		
		Random random = new Random(); //does not work for String (i tried but still need to read more)
		int arr[] = new int[5];
		int num ;
	
		
		//int num1 = random.nextInt(3);
		for(int i = 0; i < arr.length; i++) {
			num = random.nextInt(arr.length+3);
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
	}
}
