public class SavingAccount extends Account {
	private final double overdraw = 0;

	public SavingAccount() {
	}

	public SavingAccount(int id, double balance) {
		super(id, balance);
	}

	public boolean isOverdraw() {
		return getBalance() >= overdraw;
	}
}