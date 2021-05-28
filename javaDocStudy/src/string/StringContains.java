package string;

public class StringContains {

	public static void main(String[] args) {
		String s = "aaaaaaaa";
		System.out.println("a : " +  s.contains("a"));
		System.out.println("b : " + s.contains("b"));
		System.out.println("aaaaaaaaaaaaaaaaaaaa : " + s.contains("aaaaaaaaaaaaaaaaaaaa"));
		System.out.println("aaaaaaaa : " + s.contains("aaaaaaaa"));

	}

}
