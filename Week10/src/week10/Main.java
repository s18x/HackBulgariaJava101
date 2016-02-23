package week10;

public class Main {

	public static void main(String[] args) {

		int size = 10_000;
		int numberOfElements = 1_000_000;
		int numberOfProducers = 20;
		int numberOfConsumers = 20;
		MeasurementTool<Integer> queue = new MeasurementTool<>(size);
		for (int i = 0; i <= numberOfProducers; i++) {
			(new Thread(new Producer<Integer>(queue, 1))).start();
		}

	}

}
