package week01;

public class Task05 {
	public static int getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (int) (sum / (array.length - 1));
	}
}
