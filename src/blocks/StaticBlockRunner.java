package blocks;
import static blocks.StaticBLock.*;

public class StaticBlockRunner {

	public static void main(String[] args) {
		
		System.out.println(StaticBLock.counter);//printing static field
		System.out.println(StaticBLock.counter);
		System.out.println(name);
		runIt();
		
		StaticBLock sb = new StaticBLock();
		sb.runIt();
	}
}
