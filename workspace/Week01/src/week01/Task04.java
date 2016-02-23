package week01;

public class Task04 {
	public static void main(String[] args) {

	}
	
	public static int kthMin(int k, int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[i] > array[j + 1]) {
					int temp = array[i];
					array[i] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		int kthMin = array[k + 1];
		return kthMin;
	}
}
