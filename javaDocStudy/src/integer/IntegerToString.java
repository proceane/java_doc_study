package integer;

public class IntegerToString {

	public static void main(String[] args) {
		int int1 = 123;
		System.out.println("toString class : " + Integer.toString(int1).getClass());
		System.out.println("radix 2 : " + Integer.toString(int1, 2));
		
		System.out.println();
		
		System.out.println("123 toBinaryString : " + Integer.toBinaryString(int1));
		System.out.println("123 toOctalString : " + Integer.toOctalString(int1));
		System.out.println("123 toHexString : " + Integer.toHexString(int1));
		
		System.out.println();
		
		int int2 = -111;
		System.out.println("-111 toUnsignedString : " + Integer.toUnsignedString(int2));
		System.out.println("-111 toUnsignedString : " + Integer.toUnsignedString(int2, 2));
	}

}
