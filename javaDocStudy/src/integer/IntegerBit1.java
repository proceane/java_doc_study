package integer;

public class IntegerBit1 {

	public static void main(String[] args) {
		
		int i = 12345;
		System.out.println("12345 binary : " + Integer.toString(i, 2));
		System.out.println("bitCount : " + Integer.bitCount(i));
		
		System.out.println();
		System.out.println("highestOneBit : " + Integer.highestOneBit(i));
		System.out.println("lowestOneBit : " + Integer.lowestOneBit(i));
		
		System.out.println();
		System.out.println("numberOfLeadingZeros : " + Integer.numberOfLeadingZeros(i));
		System.out.println("numberOfTrailingZeros : " + Integer.numberOfTrailingZeros(i));
		
	}

}
