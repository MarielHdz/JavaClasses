package exercises;

import java.util.ArrayList;

public class Z7_StringRunner {

	public static void main(String[] args) {


		Z7_MyStringToolBox mst = new Z7_MyStringToolBox("a1s2d3f4g5h6j7k8l9;0");
		
		System.out.println(mst.calculateSum());
		System.out.println(mst.getList());
	
	}
}
