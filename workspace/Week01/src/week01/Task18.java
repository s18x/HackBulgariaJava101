package week01;

public class Task18 {

	public static void main(String[] args) {
		System.out.println(reverseEveryChar("What is this"));
	}
	
	public static String reverseEveryChar(String arg) {
		String[] parts = arg.split(" ");
		String reverse = "";
		for (int i = 0; i < parts.length; i++) {
			StringBuilder builder = new StringBuilder(parts[i]);
			reverse += builder.reverse().toString() + " ";
		}
		return reverse;
	}
}
