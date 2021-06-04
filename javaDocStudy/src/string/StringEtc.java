package string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class StringEtc {

	public static void main(String[] args) {
		
		//CASE_INSENSITIVE_ORDER : 대소문자 구분없이 정렬해주는 
		String[] s = {"a", "Z", "r", "B"};
		Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(s));
		
		//length()
		String str = "What is the length of this String?";
		System.out.println("This String's length is " + str.length());
		
		//isEmpty()
		String s1 = new String();
		System.out.println("Is s1 Empty? : " + s1.isEmpty());
		
		String s2 = "";
		System.out.println("Is s2 Empty? : " + s2.isEmpty());
		
		//getBytes()
		str = "abc";
		System.out.println("getBytes() : " + Arrays.toString(str.getBytes()));
		
		System.out.println("getBytes(Charset charset) : " + Arrays.toString(str.getBytes(Charset.defaultCharset())));
		
		try {
			System.out.println("getBytes(String charsetName) : " + Arrays.toString(str.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//hashcode()
		str = "abc";
		System.out.println(str.hashCode());
		
		//trim()
		str = "  a      b    c    ";
		System.out.println(str.trim());
		
		//intern()
		
		
		
		
		
	}

}
