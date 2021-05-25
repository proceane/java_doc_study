package string;

/**
 * String compareTo메소드
 * @date 		: 2021. 5. 25.
 */
public class StringCompareTo {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		System.out.println("abc compareTo def : " + s1.compareTo(s2));
		System.out.println("def compareTo abc : " + s2.compareTo(s1));
		System.out.println("abc compareTo abc : " + s1.compareTo(s1));
		System.out.println("! compareTo A : " + "!".compareTo("A"));
		System.out.println("a compareTo A : " + "a".compareTo("A"));
		System.out.println("a compareToIgnoreCase A : " + "a".compareToIgnoreCase("A"));
	}

}
