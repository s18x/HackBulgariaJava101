package wednesday;

public class Task01 {

	public static boolean check(String list) {
		if (list == null) {
			return false;
		}
		boolean frame = false;
		if (list.charAt(0) == '(' && list.charAt(list.length() - 1) == ')') {
			frame = true;
		}
		int numberOfOpen = 0;
		int numberOfClose = 0;
		for (int i = 0; i < list.length(); i++) {
			if (list.charAt(i) == '(') {
				numberOfOpen++;
			}
			if (list.charAt(i) == ')') {
				numberOfClose++;
			}
			if (numberOfOpen < numberOfClose) {
				return false;
			}
		}
		if (numberOfOpen == numberOfClose && frame) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

		System.out.println(check("()()())))((())("));

	}
}
