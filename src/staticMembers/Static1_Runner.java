package staticMembers;

public class Static1_Runner {

	public static void main (String[] args) {
		
		Static1_ p1 = new Static1_();
		Static1_ p2 = new Static1_();
		Static1_.species = "human";

		p1.name = "Paola";
		p2.name = "Nick";		

		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.name);
		System.out.println(Static1_.species);

		p1.species = "Monster";
		System.out.println(p2.species);
	}
}
