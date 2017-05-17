import java.math.*;

public class approximateE {
	public static void main(String[] args) {
		System.out.printf("------------  SpuerE test  -------------\n\n");
		long a = System.currentTimeMillis();
		for (int i = 100; i <= 1000; i += 100) {
			System.out.println("Percesion " + i + " " + getE(i));
		}
		long b = System.currentTimeMillis() - a;
		System.out.println();
		System.out.println("Result " + b + "ms.");
	}

	public static BigDecimal getE(int num) {
		BigDecimal e = BigDecimal.ONE.setScale(25);
		for (int i = 1; i <= num; i++) {
			e = e.add(factorial(new BigDecimal(i + "")));
		}

		return e;
	}

	public static BigDecimal factorial(BigDecimal n) {
		BigDecimal a = BigDecimal.ONE.setScale(25);
		for (BigDecimal index = BigDecimal.ONE.setScale(25); index.compareTo(n) < 1;
			index = index.add(BigDecimal.ONE)) {
			a = a.multiply(index);
		}
		return BigDecimal.ONE.divide(a,25,BigDecimal.ROUND_UP);
	}
}

