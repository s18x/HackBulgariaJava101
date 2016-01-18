package week01;

public class Task06 {
	public static void main(String[] args) {
		System.out.println(doubleFac(2));
	}
public static long doubleFac(int n) {
	long product = 1;
	long doubleFact = 1;
	for (int i = 1; i <= n; i++) {
		/*if (i == n) {
			continue;
		}
		else*/
		product *= i;
	}
	for (int i = 1; i <= product; i++) {
		doubleFact *= i;
	}
	return doubleFact;
}
}
