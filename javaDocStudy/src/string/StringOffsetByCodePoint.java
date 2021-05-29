package string;

public class StringOffsetByCodePoint {

	public static void main(String[] args) {
		String s = "saoigd";
		System.out.println("s.offsetByCodePoints(1, 3) : " + s.offsetByCodePoints(1, 3));
	
		System.out.println();
		
		s = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < s.length() - 3; i = i + 2) {
			System.out.println("index: " + i + ", " + s.charAt(s.offsetByCodePoints(i, 3)) + " ");
		}
	}

}
