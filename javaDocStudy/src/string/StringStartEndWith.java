package string;

public class StringStartEndWith {

	public static void main(String[] args) {
		String s = "apple banana";
		System.out.println("s.startsWith(\"app\") : " + s.startsWith("app"));
		System.out.println("s.startsWith(\"app\", 3) : " + s.startsWith("app", 3));
		System.out.println("s.startsWith(\"app\", 0) : " + s.startsWith("app", 0));
		
		System.out.println("s.endsWith(\"ana\") : " + s.endsWith("ana"));
 
	}

}
