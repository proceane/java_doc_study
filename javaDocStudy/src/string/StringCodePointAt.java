package string;

public class StringCodePointAt {

	public static void main(String[] args) {
		String s = "abcde";
		System.out.println("s.codePointAt(2) : " + s.codePointAt(2));
		
		int[] codePoints = {97, 98, 99, 100, 101};
		System.out.println("int[] codePoints toString : " + new String(codePoints, 0, 5));
		
		System.out.println("(int)'v' : " + (int)'v');
		
		s = "ABCDE";
		System.out.println("s.codePointBefore(1) : " + s.codePointBefore(1));
		System.out.println();
		//System.out.println("s.codePointBefore(0) : " + s.codePointBefore(0));
		
		s = "EWQRWET";
		System.out.println("s.codePointBefore(2) : " + s.codePointBefore(2));
		
		System.out.println();
		
		s = "TRHJDJ";
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i - 1) < s.charAt(i)) {
				System.out.println(s.charAt(i) + " is bigger than " + s.charAt(i - 1));
			}
		}
		
		System.out.println();
		
		for(int i = 1; i < s.length(); i++) {
			if(s.codePointBefore(i) < s.codePointAt(i)) {
				System.out.println(s.codePointAt(i) + " is bigger than " + s.codePointBefore(i));
			}
		}
		
		System.out.println();
		
		for(int i = 1; i < s.length(); i++) {
			if(s.codePointBefore(i) < s.codePointAt(i)) {
				System.out.println((char)s.codePointAt(i) + " is bigger than " + (char)s.codePointBefore(i));
			}
		}
		
		System.out.println();
		
		String s1 = "A     B";
		System.out.println("s1.codePointCount(0, s1.length()) : " + s1.codePointCount(0, s1.length()));
		
		String s2 = "AB";
		System.out.println("s2.codePointCount(0, s2.length()) : " + s2.codePointCount(0, s2.length()));
	}

}
