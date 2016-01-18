package wednesday;

public class Task01 {

	public static boolean check(String list) {
		if (list == null) {
			return false;
			//maybe throw exception
		}
		int openedClosedBracketDifference = 0;
		for (int i = 0; i < list.length(); i++) {
			if (list.charAt(i) == '(') {
				openedClosedBracketDifference++;
			}
			if (list.charAt(i) == ')') {
				openedClosedBracketDifference--;
			}
			if (openedClosedBracketDifference < 0) {
				return false;
			}
		}
		return (openedClosedBracketDifference == 0);
		
	}
	
	public static void main(String[] args) {
		System.out.println(check("()"));
		System.out.println(check("(()))("));
	}
}



