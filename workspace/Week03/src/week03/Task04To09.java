package week03;

public class Task04To09<T extends Number> {

	private T number1;
	private T number2;

	T getNumber1() {
		return number1;
	}

	void setNumber1(T number1) {
		this.number1 = number1;
	}

	T getNumber2() {
		return number2;
	}

	void setNumber2(T number2) {
		this.number2 = number2;
	}

	public double sum(T number1, T number2) {
		return (double) number1 + (double) number2;
	}

	public double sub(T number1, T number2) {
		return (double) number1 - (double) number2;
	}

	public double mult(T number1, T number2) {
		return (double) number1 * (double) number2;
	}
	
	public double div(T number1, T number2) {
		return (double) number1 / (double) number2;
	}
	
	public double pow(T number1, T number2) {
		return Math.pow((double) number1, (double) number2);
	}
	
	public double fact(T number1) {
		double result = 1;
		for (double i = (double) number1; i >= 1; i--) {
			result *= (double) number1;
		}
		return result;
	}
	
	
}
