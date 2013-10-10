public class Account {
	
	private String name;
	private String pin;
	private double balance;


	public Account(String name, int pin, double balance) {
		setName(name);
		setPin(pin);
		setBalance(balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setName(String pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}