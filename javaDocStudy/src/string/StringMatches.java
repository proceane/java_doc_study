package string;

public class StringMatches {

	public static void main(String[] args) {
		String s = "ABC";
		System.out.println("ABC matches \"^[A-Z]*$\" : " + s.matches("^[A-Z]*$"));
		
		s = "Aabc";
		System.out.println("Aabc matches \"^[A-Z]*$\" : " + s.matches("^[A-Z]*$"));
		
		System.out.println("--------------------------------");
		
		String numStr = "123abc";
		boolean flag = false;
		for(char c : numStr.toCharArray()) {
			if(Character.isDigit(c)) {
				flag = true;
				break;
			}
			if(Character.isAlphabetic(c)) {
				flag = true;
				break;
			}
		}
		System.out.println("flag : " + flag);
		
		System.out.println("matches : " + numStr.matches("^[a-zA-Z0-9]*$"));
		
		System.out.println("--------------------------------");
		
		String str = "I Like Peach!";
		String s1 = "peach";
		System.out.println("str.regionMatches(7, s1, 0, 5) : " + str.regionMatches(7, s1, 0, 5));
		System.out.println("str.regionMatches(true, 7, s1, 0, 5) : " + str.regionMatches(true, 7, s1, 0, 5));
		
		System.out.println("--------------------------------");
		
		//1111로 끝나는 전화번호의 개수는?
		String[] phoneNumber = {"010-1111-1111", "010-1234-1111", "010-1122-1111", "010-2222-2222"};
		int count = 0;
		for(String num : phoneNumber) {
			if(num.regionMatches(9, "1111", 0, 4)) count++;
		}
		System.out.println(count);
		
	}

}
