public class TestTax {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			System.out.println("2001 --- filingStatus " + i);
			for (int j = 50000; j <= 60000; j += 1000) {
				System.out.print(new Tax(i, j, 2001).getTax() + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			System.out.println("2009 --- filingStatus " + i);
			for (int j = 50000; j <= 60000; j += 1000) {
				System.out.print(new Tax(i, j, 2009).getTax() + " ");
			}
			System.out.println();
		}
	}
}