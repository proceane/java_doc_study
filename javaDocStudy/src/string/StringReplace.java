package string;

public class StringReplace {

	public static void main(String[] args) {
		String s = "abc aaa bbb";
		System.out.println(s.replace("a", "d"));
		
		s = "aaa aaa aaa";
		System.out.println(s.replace("b", "d"));
		System.out.println(s.replace("aaa", "d"));
		System.out.println(s.replace("aaa", "ddd"));
		System.out.println(s.replace('a', 'd'));
		
		System.out.println("--------------------------");
		
		s = "010-0000-0000";
		System.out.println(s.replaceFirst("-", "*"));
		System.out.println(s.replaceAll("-", "*"));
		System.out.println(s.replaceAll("[0-9]", "*"));
		
		System.out.println("---------------------------");
		
		System.out.println(s.replaceAll("[0-9]{4}", "****"));
	}

}
