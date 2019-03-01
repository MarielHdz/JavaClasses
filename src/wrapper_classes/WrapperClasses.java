package wrapper_classes;

public class WrapperClasses {

	public static void main (String[] args) {
		
		comparing();
		
		
	}
	
	public static void comparing() {
		Boolean boo = new Boolean("true"); 
		Boolean boop = new Boolean ("true"); 
		System.out.println(boo==boop);    //false
		
		Boolean boo2 = true; 
		Boolean boop2 = true; 
		System.out.println(boo2==boop2);  //true
		         
		Character ch  = new Character('A');
		Character chp = new Character('A'); 
		System.out.println(ch==chp);  //false
		
		Character ch2 = 'A';
		Character chp2 = 'A'; 
		System.out.println(ch2==chp2);  //true
	}
	
	
	/*
	 * Following method is only a representation of the wrapper classes and its constructors
	 */
	
	public static void wrapperClassesExamples() {
		Boolean boo = new Boolean(true);
		Boolean boo2 = new Boolean("true");
		Character ch = new Character('A');
		Byte by = new Byte((byte)123);
		Byte by2 = new Byte("123");
		Short sh = new Short((short)1200);
		Short sh2 = new Short("1200");
		Integer in = new Integer(1202);
		Integer in2 = new Integer("1202");
		Long lo = new Long(200000L);
		Long lo2 = new Long("200000");
		Float fl = new Float(12.2F);
		Float fl2 = new Float("12.2");
		Double dbl = new Double(3.1234567890);
		Double dbl2 = new Double("3.1234567890");
	}
	
	/*
	 * When we want to put a primitive type into a wrapper is called boxing
	 * When we want to put a wrapper type into a primitive is called unboxing
	 */
	public static void boxingAndUnboxing() {
		Boolean boo = Boolean.valueOf("true");  //<- boxing
		boolean boop = Boolean.parseBoolean("false"); //<- unboxing
	}
	
	/*
	 * To convert a String into a wrapper type we use the method valueOf
	 */
	public static void stringToWrapper() {
		Boolean boo = Boolean.valueOf("true");
		//Character ch = Character.valueOf  //<-Can not be converted
		Byte by = Byte.valueOf("123");
		Short sh = Short.valueOf("1200");
		Integer in = Integer.valueOf("1202");
		Long lo = Long.valueOf("200000");
		Float fl = Float.valueOf("3.5");
		Double dou = Double.valueOf("2.56789087");
		
		System.out.println(boo);
		System.out.println(lo);
	}
	
	/*
	 * To convert a String into a primitive type we use the method parse
	 */
	public static void stringToPrimitive() {
		boolean boo = Boolean.parseBoolean("true");
		//char ch = Character.pars  //<-Can not be converted
		byte by = Byte.parseByte("123");
		short sh = Short.parseShort("1200");
		int in = Integer.parseInt("1202");
		long lo = Long.parseLong("200000");
		float fl = Float.parseFloat("3.5");
		double dou = Double.parseDouble("2.56789087");
		
		System.out.println(boo);
		System.out.println(lo);
	}
	
}
