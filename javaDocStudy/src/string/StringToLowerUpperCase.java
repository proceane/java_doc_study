package string;

import java.util.Locale;

public class StringToLowerUpperCase {

	public static void main(String[] args) {
		String s = "ABC";
		System.out.println("ABC toLowerCase : " + s.toLowerCase());
		
		s = "abc";
		System.out.println("abc toUpperCase : " + s.toUpperCase());
		
		String s2 = "III";
		Locale tr = new Locale("tr", "TR");
		System.out.println("III toLowerCase(Turkish) : " + s2.toLowerCase(tr));
		System.out.println("III toLowerCase : " + s2.toLowerCase());
		
		System.out.println();
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('s'));

	}

}
