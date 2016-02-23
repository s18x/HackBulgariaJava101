package week01;

public class Task30 {

	public static void main(String[] args) {
		System.out.println(Integer.toString(countVowels("A nice day to code!")));
	}
	
	public static int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'Y') {
				count++;
			}
		}
		return count;
	}
}
