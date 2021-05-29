package string;

public class StringSubString {

	public static void main(String[] args) {
		String s = "abcdefghijklmnop";
		System.out.println(s.substring(10));
		System.out.println(s.substring(7, 10));
		
		System.out.println();
		System.out.println(s.subSequence(2, 5));

	}

}
