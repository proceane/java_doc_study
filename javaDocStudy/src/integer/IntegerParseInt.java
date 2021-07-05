package integer;

public class IntegerParseInt {

	public static void main(String[] args) {
		
		//parseInt
		String s1 = "1001";
		System.out.println("\"1001\" parseInt : " + Integer.parseInt(s1));
		System.out.println("\"1001\" parseInt + radix : " + Integer.parseInt(s1, 2));
		
		System.out.println();
		
		//parseUnsignedInt
		String s2 = "1111";
		System.out.println("\"1111\" parseUnsignedInt : " + Integer.parseUnsignedInt(s2));
		System.out.println("\"1111\" parseUnsignedInt : " + Integer.parseUnsignedInt(s2, 2));
	}

}
