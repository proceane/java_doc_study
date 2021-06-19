package string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringEtc {

	public static void main(String[] args) {
		
		//CASE_INSENSITIVE_ORDER : 대소문자 구분없이 정렬해주는 
		String[] s = {"a", "Z", "r", "B"};
		Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
		System.out.println("array : " + Arrays.toString(s));
		
		String[] copys = s.clone();
		Arrays.sort(copys, new Comparator<String>() {
			//대소문자 상관없이 정렬해야되서 toLowerCase사용
			@Override
			public int compare(String o1, String o2) {
				return o1.toLowerCase().compareTo(o2.toLowerCase());
			}

			
		});
		
		//System.out.println(Arrays.toString(copys));
		
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("Z");
		strList.add("r");
		strList.add("B");
		Collections.sort(strList, String.CASE_INSENSITIVE_ORDER);
		System.out.println("list : " + strList.toString());
		
		System.out.println();
		
		//length()
		String str = "   What is the length of this String?";
		System.out.println("This String's length is " + str.length());
		
		System.out.println();
		
		//isEmpty()
		String s1 = new String();
		System.out.println("Is s1 Empty? : " + s1.isEmpty());
		
		String s2 = "";
		System.out.println("Is s2 Empty? : " + s2.isEmpty());
		
		System.out.println();
		
		//getBytes()
		str = "abc";
		System.out.println("getBytes() : " + Arrays.toString(str.getBytes()));
		
		System.out.println("getBytes(Charset charset) : " 
						+ Arrays.toString(str.getBytes(Charset.defaultCharset())));
		
		try {
			System.out.println("getBytes(String charsetName) : " + Arrays.toString(str.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String korean = "안녕하세요";
		byte[] koreanByte = korean.getBytes();
		System.out.println("안녕하세요 -> byte[] : " + Arrays.toString(koreanByte));
		System.out.println(new String(koreanByte));
		
		System.out.println();
		
		char[] charArr = str.toCharArray();
		System.out.println(Arrays.toString(charArr));
		
		System.out.println();
		
		//hashcode()
		str = "abc";
		System.out.println(str.hashCode());
		
		System.out.println();
		//trim()
		str = "  a      b    c    ";
		System.out.println("시작" + str.trim() + "끝");
		
		System.out.println();
		
		//intern()
		String str1 = "WORD";
		String str2 = "WORD";
		System.out.println("str1's hashcode : " + str1.hashCode());
		System.out.println("str2's hashcode : " + str2.hashCode());
		
		String str3 = new String("WORD");
		System.out.println("str3's hashcode : " + str3.hashCode());
		System.out.println("str1 == str3 result : " + String.valueOf(str1 == str3));
		
		String str4 = new String("WORD").intern();
		System.out.println("str1 == str4 result : " + String.valueOf(str1 == str4));
		
		
	}

}
