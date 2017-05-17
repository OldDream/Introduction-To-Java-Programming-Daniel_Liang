public class TestStock {
	public static void main(String[] args) {
		Stock newstock = new Stock("ORCL", "Oracle Corporation");
		newstock.previousClosingPrice = 34.5;
		newstock.currentPrice = 34.35;

		System.out.println("The change percentage of " + newstock.name + " is " + 
			newstock.getChangePercent() + "%");
	}
}