package string;

import java.util.Locale;

public class StringFormatConcat {
	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "a";
		System.out.println(String.format("String : %S, %s", s1, s2));
		System.out.println(String.format("String : %S, %s", s2, s1));
		System.out.println(String.format(Locale.KOREAN, "String : %s", s1));
		
		System.out.println();
		System.out.println(String.format("%,d won", 100000));
		System.out.println(String.format("%010d", 123));
		
		System.out.println();
		
		String s = "A";
		System.out.println(s.concat("B"));
	}
}
