package string;

import java.util.Arrays;

public class StringSplit {
	public static void main(String[] args) {
		String s = "a:b:c:d:e";
		String[] arr = s.split(":");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = s.split(":", 3);
		System.out.println(Arrays.toString(arr2));
	}
}
