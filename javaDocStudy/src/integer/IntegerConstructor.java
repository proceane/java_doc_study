package integer;

public class IntegerConstructor {

	public static void main(String[] args) {
		
		//Integer(int value)
		Integer int1 = new Integer(111);
		
		//Integer(String s)
		Integer int2 = new Integer("123");
		
		int int3 = 222;
		
		// 당연하게도 Exception발생
		// Integer int4 = new Integer("333333333333");
		// Integer int5 = new Integer("aaa");
		
		System.out.println("111 + \"123\" : " + (int1 + int2));
		
	}

}
