package string;

public class StringIndexOf {

	public static void main(String[] args) {
		String s = "abcde";
		System.out.println("What is 98(b)'s location? : " + s.indexOf(98));
		
		System.out.println("What is e's location? : " + s.indexOf("e"));
		
		System.out.println("What is 100(d)'s location from index 2? : " + s.indexOf(100, 2));
		
		System.out.println("What is d's location from index 5? : " + s.indexOf("d", 5));
		
		System.out.println("What is bc's location from index 5? : " + s.indexOf("bc"));
		
		System.out.println();
		
		s = "abbbba";
				
		System.out.println("97(a)'s location : " + s.lastIndexOf(97));
		System.out.println("a's location : " + s.lastIndexOf("a"));
		System.out.println("97(a)'s location from index 3 : " + s.lastIndexOf(97, 3));
		System.out.println("97(a)'s location from index 5 : " + s.lastIndexOf("a", 5));

	}

}
