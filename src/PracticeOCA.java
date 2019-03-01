import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class PracticeOCA extends Ski implements int1, int2{

	final int min = 0,max =100;
	private int age = 18;
static int count;
	public static void sell(PracticeOCA racer, int[] speed, String name) {

		racer.age = 18;
		name = "Wendy";
		speed = new int[1];
		speed[0] = 11;
		racer = null;
	}

	public  String grow() {
		return "super growing";
	}
	
	public static void main(String[] args) {

		count++;
		// String one = args[0];
		// Arrays.sort(args);
		// int result = Arrays.binarySearch(args, one);
		// System.out.println(result);

		final PracticeOCA mySkier = new PracticeOCA();
		mySkier.age = 16;
		final int[] mySpeed = new int[1];
		final String myName = "rosita";
		sell(mySkier, mySpeed, myName);

		int1 i = new PracticeOCA();
		i.grow();
		//System.out.println(((int2)i).grow());
		
		String arr[] = {"a"};
		List<String> list = Arrays.asList(arr);
		//list.remove("a");
		System.out.println(list);
		
		StringBuilder s;
		
		LocalTime sss = LocalTime.now();

int d = 1;

if (4 != 2) {
	
}
		
		Ski3 ffs = new Ski3();
		
	}
}

class Ski extends Ski2 {

}

class Ski2 {

}

class Ski3 {

	public Ski3(){
		System.out.println("p");
		{System.out.println("la");}
	}
}

interface int1 {
	default String grow() {
		return "grow";
	}
}

interface int2 {

	public default String grow() {
		return "growing";
	}
}