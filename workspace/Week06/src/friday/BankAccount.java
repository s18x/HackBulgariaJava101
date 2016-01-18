package friday;

public class BankAccount {

	private String firstName;
	private String lastName;
	private int age;
	private static int ID = 0;
	private double balance;
	private double interest;
	private boolean interestType;// 0 - simple / 1 - complex
	private String[] history = new String[5];
	private int numberOfOperations = 0;

	public BankAccount(String firstName, String lastName, int age, double balance, double interest, boolean interestType) {
		super();
		for (int i = 0; i < firstName.length(); i++) {
			if (Character.isLetter(firstName.charAt(i))) {
				this.firstName = firstName;
			}
			else {
				throw new IllegalArgumentException("sowy");
			}
		}
		for (int i = 0; i < firstName.length(); i++) {
			if (Character.isLetter(firstName.charAt(i))) {
				this.lastName = lastName;
			}
			else {
				throw new IllegalArgumentException("sowy");
			}
		}
		if (age < 0) {
			throw new IllegalArgumentException("sowy");
		}
		else {
			this.age = age;
		}
		if (balance <= 0) {
			throw new IllegalArgumentException("sowy");
		}
		else {
			this.balance = balance;
		}
		if (interest <= 0) {
			throw new IllegalArgumentException("sowy");
		}
		else {
			this.interest = interest;
		}
		this.interestType = interestType;
		this.ID++;
	}

	public void add(double amount) {
		if (amount > 0) {
			this.balance += amount;
			if (numberOfOperations > 4) {
				for (int i = 0; i < history.length; i++) {
					history[i] = history [i + 1];
				}
				history[5] = "Added amount: " + amount;
			}
			else {
				for (int i = 0; i < history.length; i++) {
					if (history[i] == null) {
						history[i] = "Added amount: " + amount;
						break;
					}
				}
			}
			numberOfOperations++;
		}
		else {
			throw new IllegalArgumentException("sowy");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount && this.interest <= 1) {
			this.balance -= amount;
			if (numberOfOperations > 4) {
				for (int i = 0; i < history.length - 1; i++) {
					history[i] = history [i + 1];
				}
				history[5] = "Withdraw amount: " + amount;
			}
			else {
				for (int i = 0; i < history.length - 1; i++) {
					if (history[i] == null) {
						history[i] = "Withdraw amount: " + amount;
						break;
					}
				}
			}
			numberOfOperations++;
		}
		else {
			throw new IllegalArgumentException("sowy");
		}
	}

	public void transfer(BankAccount account, double amount) {
		if (amount > 0 && account != null) {
			account.balance -= amount;
			if (numberOfOperations > 4) {
				for (int i = 0; i < history.length - 1; i++) {
					history[i] = history [i + 1];
				}
				history[5] = "Withdraw amount: " + amount;
			}
			else {
				for (int i = 0; i < history.length - 1; i++) {
					if (history[i] == null) {
						history[i] = "Withdraw amount: " + amount;
						break;
					}
				}
			}
			numberOfOperations++;
		}
		else {
			throw new IllegalArgumentException("sowy");
		}
	}

}
