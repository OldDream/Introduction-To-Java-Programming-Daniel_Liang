public class CheckingAccount extends Account {
	private double overdraw;

	public CheckingAccount() {
		overdraw = -10000;
	}

	public CheckingAccount(int id, double balance, double overdraw) {
		super(id, balance);
		this.overdraw = overdraw;
	}

	public void setOverdraw(double overdraw) {
		this.overdraw = overdraw;
	}

	public boolean isOverdraw() {
		return getBalance() >= overdraw;
	}
}