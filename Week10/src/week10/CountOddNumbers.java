package week10;

import java.util.concurrent.CopyOnWriteArrayList;

public class CountOddNumbers<T> {

	private CopyOnWriteArrayList<T> numbers;

	public CountOddNumbers() {
		super();
		this.numbers = new CopyOnWriteArrayList<>();
	}

	public CopyOnWriteArrayList<T> getNumbers() {
		return numbers;
	}

}
