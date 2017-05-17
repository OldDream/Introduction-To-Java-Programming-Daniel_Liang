public class exercise_11_8 {
	public static void main(String[] args) {
		Account ha = new Account("Huang", 1122, 20000);
		ha.setAnnualInterestRate(4.5);
		ha.withDraw(2500);
		ha.deposit(3000);
		System.out.println("Balance: " + ha.getBalance());
		System.out.println("MonthlyInterest: " + ha.getMonthlyInterest());
		System.out.println("Date: " + ha.getDateCreated());
		System.out.println("--------Transactions----------");
		for (String a : ha.PrintTransactions())
			System.out.println(a);
	}
}