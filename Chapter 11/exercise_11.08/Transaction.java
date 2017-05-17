public class Transaction {
	private java.util.Date date;
	private char type;
	private double amount, balance;
	private String description;

	public Transaction(char type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = "Time is " + new java.util.Date().toString() + " Type is " + type + " amount is " +
							 amount + " balance is " + balance + ".\n";
	}

	public String toString() {
		return description;
	}
}