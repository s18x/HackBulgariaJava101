package week01;

public class Task20 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(123321));
	}
	
	public static boolean isPalindrome(int arg) {
		String number = Integer.toString(arg);
		return Task19.isPalindrome(number);
	}
}
