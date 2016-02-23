package week01;

public class Task09 {
	
	public static void main(String[] args) {
		System.out.println(Long.toString(getLargestPalindrome(1234323)));
	}
	
	public static long getLargestPalindrome(long n) {
		boolean isPalindrome = true;
		long largestPalindrome = 0;
		String number;
		while (n > 0) {	
			number = Long.toString(n);
			for (int i = 0; i < number.length(); i++) {
				if (number.charAt(i) != number.charAt(number.length() - (i + 1))) {
					isPalindrome = false;
				}
			}
			if (isPalindrome) {
				largestPalindrome = n;
				break;
			}
			n--;
		}	
		return largestPalindrome;
	}
}
