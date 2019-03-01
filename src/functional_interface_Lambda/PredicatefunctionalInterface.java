package functional_interface_Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicatefunctionalInterface {

	public static void main(String[] args) {

		Predicate<Integer> isOld = granpaAge -> granpaAge > 70;
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(69);
		arr.add(70);
		arr.add(71);

		System.out.println(arr); // [69, 70, 71]

		for (int each : arr) {
			if (isOld.test(each)) {
				System.out.println(each); // 71
			}
		}

		arr.removeIf(isOld); // this list method accepts a Predicate
		System.out.println(arr); // [69, 70]

		////////////////////////////////////////////////////////
		Panda p1 = new Panda();
		p1.age = 1;
		Panda.check(p1, pandaAge -> {return pandaAge.age < 5;});
		///////////////////////////////////////////////////////
		
		
		Climber.check((height , limit) -> height < limit , 5); //too high
		
		String a ="";
		
		System.out.println(a.isEmpty());
	}
}

class Panda {
	int age;

	public static void check(Panda panda, Predicate<Panda> pred) {
		String result = pred.test(panda) ? "match" : "not match";
		System.out.println(result);
	}
}

interface Climb{
	boolean isTooHigh(int height, int limit);
}

class Climber{
	
	public static void check(Climb climb, int height) {
		if(climb.isTooHigh(height, 10))
			System.out.println("too high");
		else
			System.out.println("ok");
	}
}