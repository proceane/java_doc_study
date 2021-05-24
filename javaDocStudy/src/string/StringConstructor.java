package string;

import java.nio.charset.Charset;

public class StringConstructor {

	public static void main(String[] args) throws Exception {
		//빈문자열
		String s = new String();
		System.out.println("1. new String() : " + s + "***");
		
		//String(byte[] bytes)
		byte[] ascii = {101, 108};
		String s2 = new String(ascii);
		System.out.println("2. new String(ascii) : " + s2 + "***");
		
		//String(byte[] bytes, Charset charset)
		String s3 = new String(ascii, Charset.defaultCharset());
		System.out.println("3. new String(ascii, charset) : " + s3 + "***");
		
		//String(byte[] ascii, int hibyte)
		String s4 = new String(ascii, 8);
		System.out.println("4. new String(ascii, hibyte) : " + s4 + "***");
		
		//String(byte[] bytes, int offset, int length)
		String s5 = new String(ascii, 0, 1);
		System.out.println("5. new String(ascii, offset, length) : " + s5 + "***");
		
		//String(byte[] bytes, int offset, int length, Charset charset)
		String s6 = new String(ascii, 0, 1, Charset.defaultCharset());
		System.out.println("6. new String(ascii, offset, length, charset) : " + s6 + "***");
		
		//byte[] ascii, int hibyte, int offset, int count
		String s7 = new String(ascii, 8, 0, 1);
		System.out.println("7. new String(ascii, 8, 0, 1) : " + s7 + "***");
		
		//String(byte[] bytes, int offset, int length, String charsetName)
		String s8 = new String(ascii, 0, 1, "utf-8");
		System.out.println("8. new String(ascii, offset, length, string charset) : " + s8 + "***");
		
		//String(byte[] bytes, String charsetName)
		String s9 = new String(ascii, "utf-8");
		System.out.println("9. new String(ascii, charset) : " + s9 + "***");
		
		//char[] value
		char[] value = {'a', 'b', 'c'};
		String s10 = new String(value);
		System.out.println("10. new String(value) : " + s10 + "***");
		
		//char[] value, offset, count -> offset부터 count개수만큼 문자열로 변환
		String s11 = new String(value, 0, 2);
		System.out.println("11. new String(value, 0, 2) : " + s11 + "***");
		
		//String
		String s12 = new String("s2");
		System.out.println("12. new String(\"s2\") : " + s12 + "***");
				
		//int[] codePoints, offset, count
		int[] codePoints = {s2.codePointAt(0), s2.codePointAt(1)};
		String s13 = new String(codePoints, 0, 2);
		System.out.println("13. new String(codePoints, 0, 2) : " + s13 + "***");
		
		//StringBuffer
		StringBuffer sf = new StringBuffer("Hello");
		String s14 = new String(sf);
		System.out.println("14. new String(sf) : " + s14 + "***");
		
		//StringBuilder
		StringBuilder sb = new StringBuilder("world");
		String s15 = new String(sb);
		System.out.println("15. new String(sb) : " + s15 + "***");
		
		
		//result
//		1. new String() : ***
//		2. new String(ascii) : el***
//		3. new String(ascii, charset) : el***
//		4. new String(ascii, hibyte) : ࡥ࡬***
//		5. new String(ascii, offset, length) : e***
//		6. new String(ascii, offset, length, charset) : e***
//		7. new String(ascii, 8, 0, 1) : ࡥ***
//		8. new String(ascii, offset, length, string charset) : e***
//		9. new String(ascii, charset) : el***
//		10. new String(value) : abc***
//		11. new String(value, 0, 2) : ab***
//		12. new String("s2") : s2***
//		13. new String(codePoints, 0, 2) : el***
//		14. new String(sf) : Hello***
//		15. new String(sb) : world***

	}
}
