package week01;

public class Task19 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("ABBA"));
	}
	
	public static boolean isPalindrome(String arg) {
		for (int i = 0; i < (arg.length() / 2) + 1; ++i) {
			if (arg.charAt(i) != arg.charAt(arg.length() - i -1)) {
				return false;
			}
		}
		return true;
	}
}
