package string;

public class StringValueOf {

	public static void main(String[] args) {
		int i = 10;
		char[] data = {'a', 'b', 'c', 'd', 'e'};
		boolean b = true;
		long l = 100000000000000l;
		float f = 0.000000000001f;
		double d = 0.11111111111;
		
		System.out.println("int : " + String.valueOf(i) + ", class : " + String.valueOf(i).getClass());
		System.out.println("char[] : " + String.valueOf(data) + ", class : " + String.valueOf(data).getClass());
		System.out.println("char[] + offset + count : " + String.valueOf(data, 1, 3) + ", class : " + String.valueOf(data, 1, 3).getClass());
		System.out.println("boolean : " + String.valueOf(b) + ", class : " + String.valueOf(b).getClass());
		System.out.println("long : " + String.valueOf(l) + ", class : " + String.valueOf(l).getClass());
		System.out.println("float : " + String.valueOf(f) + ", class : " + String.valueOf(f).getClass());
		System.out.println("double : " + String.valueOf(d) + ", class : " + String.valueOf(d).getClass());
		
		System.out.println();
		String s = "aaa";
		System.out.println(s.toString().getClass());
		
		System.out.println();
		System.out.println(String.copyValueOf(data, 1, 3));
		System.out.println(String.copyValueOf(data));
	}

}
