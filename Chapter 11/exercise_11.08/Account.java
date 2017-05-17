import java.util.ArrayList;

public class Account {
	private String name = "";
	private int id = 0;
	private double balance = 0,
				   annualInterestRate = 0;
	private java.util.Date Created = new java.util.Date();
	private ArrayList<Transaction> transactions = new ArrayList<>();

	public Account() {

	}

	public Account(String name, int id, double balance) {
		this.name = name;
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
		transactions.add(new Transaction('W', cash, balance));
	}

	public void deposit(double cash) {
		this.balance += cash;
				transactions.add(new Transaction('D', cash, balance));
	}

	public String[] PrintTransactions() {
		StringBuilder temp = new StringBuilder(transactions.toString());
		String tempstr = temp.substring(1, temp.length() - 1);
		return tempstr.split(", ");
//		return transactions.toString();
	}

}