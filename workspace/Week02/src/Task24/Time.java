package Task24;

public class Time {

	private int hour;
	private int minute;
	private int second;

	private int date;
	private int month;
	private int year;

	public Time(int hour, int minute, int second, int date, int month, int year) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
		this.setDate(date);
		this.setMonth(month);
		this.setYear(year);
	}

	int getHour() {
		return hour;
	}

	void setHour(int hour) {
		this.hour = hour;
	}

	int getMinute() {
		return minute;
	}

	void setMinute(int minute) {
		this.minute = minute;
	}

	int getSecond() {
		return second;
	}

	void setSecond(int second) {
		this.second = second;
	}

	int getDate() {
		return date;
	}

	void setDate(int date) {
		this.date = date;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	void now() {
		System.out.println(System.currentTimeMillis());
	}

	@Override
	public String toString() {
		return String.format("%d:%d:%d %d.%d.%d", hour, minute, second, date, month, year);
	}

}
