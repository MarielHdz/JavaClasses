package casting;

public class CatingPrimitives {

	public static void main(String[] args) {
		
		long i = 10;
		byte b = (byte)i;
		short s = b;
		int j = s;
		long l = s;
		float f = l;
		double d = f;
		
		
		long i2 = 10;		
		byte b2 = (byte)i2;
		short s2 = (short)i2;
		int j2 = (int)i2;
		long l2 = i2;
		float f2 = i2;
		double d2 = i2;
	}
}
