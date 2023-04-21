package testTarget.src;

public class StringQuestion {
	public static final String reverseString(String str) {
		
		if(str.length() == 1 || str == null) {
			return str;
		}
		String reversedString = "";

		for(int i = str.length() - 1; i>= 0; i--) {
			reversedString += str.charAt(i);
		}
		return reversedString;
		
	}
}
