package week01;

public class Task32 {

	public static void main(String[] args) {
		System.out.println(pScore(132));
	}
	
	public static int pScore(int n) {
		String nString = Integer.toString(n);
		StringBuilder builder = new StringBuilder(nString);
		if (Task20.isPalindrome(n)) {
			return 1;
		}
		else {
			return 1 + (n + Integer.parseInt(builder.reverse().toString()));
		}
	}
}
