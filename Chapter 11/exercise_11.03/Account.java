public class Account {
	private int id = 0;
	private double balance = 0,
				   annualInterestRate = 0;
	private java.util.Date Created = new java.util.Date();

	public Account() {

	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
//setter & getter.
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate * 100;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}

	public String getDateCreated() {
		return Created.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12 * 100;
	}

	public double getMonthlyInterest() {
		return balance * annualInterestRate / 12;
	}

	public void withDraw(double cash) {
		this.balance -= cash;
	}

	public void deposit(double cash) {
		this.balance += cash;
	}

}