package integer;

public class IntegerCompare {

	public static void main(String[] args) {
		
		int a = 10;
		int b = -50;
		System.out.println("10 compare -50 : " + Integer.compare(a, b));
		System.out.println("10 compareUnsigned -50 : " + Integer.compareUnsigned(a, b));
		
		System.out.println();
		//compareTo는 Integer클래스에서 사용가능
		Integer c = 10;
		System.out.println("10 compareTo 10 : " + c.compareTo(10));
		
		System.out.println();
		
		//max, min
		System.out.println("Max : " + Integer.max(a, b));
		System.out.println("Min : " + Integer.min(a, b));
		
		System.out.println();
		
		//equals
		System.out.println("10 == 10 ? " + new Integer(10).equals(10));
	}

}
