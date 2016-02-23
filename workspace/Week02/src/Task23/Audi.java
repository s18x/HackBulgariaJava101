package Task23;

public class Audi extends Car implements GermanCar {

	private int mileage;

	int getMileage() {
		return mileage;
	}

	void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public void mileage(int mileage) {
		System.out.println(Integer.toString(mileage));
	}
}
