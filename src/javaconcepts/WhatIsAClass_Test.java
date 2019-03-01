package javaconcepts;

public class WhatIsAClass_Test {
	
	public static void main (String[] args) {
		
		WhatIsAClass p1 = new WhatIsAClass();
		p1.name  = "Paola";
		p1.age = 31;
		p1.gender = 'F';
		p1.eat();
		p1.read();
		int birthDate = p1.year();
		System.out.println(birthDate);
		System.out.println(p1.greet("Pao"));
		
		WhatIsAClass p2 = new WhatIsAClass();
		p2.name  = "Juan";
		p2.age = 27;
		p2.gender = 'M';

	}

	
}
