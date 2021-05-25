package string;

/**
 * 자바 문자열 비교메소드
 * @date 		: 2021. 5. 25.
 */
public class StringEquals {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = "ABC";
		System.out.println("s1 == s2 : " + (s1 == s2));	//같은 주소를 바라보기때문에 true
		System.out.println("s1 == s3 : " + (s2 == s3));	//false
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println("s1.equalsIgnoreCase(s4) : " + s1.equalsIgnoreCase(s4));
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.println("s1.contentEquals(sb) : " + s1.contentEquals(sb));
		
		CharSequence cs = new StringBuffer("abc");
		System.out.println("s1.contentEquals(cs) : " + s1.contentEquals(cs));
		
		CharSequence cs2 = new StringBuilder("abc");
		System.out.println("s1.contentEquals(cs2) : " + s1.contentEquals(cs2));
		
	}

}
