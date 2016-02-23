package week01;

public class Task29 {

	public static void main(String[] args) {
		System.out.println(isHack(7919));
		System.out.println(nextHack(7800));
	}
	
	public static boolean isHack(int n) {
		String binary = Integer.toBinaryString(n);
		char[] array = binary.toCharArray();
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '1') {
				counter++;
			}
		}
		if (counter % 2 == 1 && Task19.isPalindrome(binary)) {
			return true;
		}
		else
			return false;
	}
	
	public static int nextHack(int n) {
		if (n == Integer.MAX_VALUE) {
			return 1;
		}
		while (!isHack(n)) {
			n++;
		}
		return n;
	}
}
