import java.math.*;

public class exercise_10_16 {
	public static void main(String[] args) {
		System.out.println("Divided by 2 :");
		for (int i = 0, j = 0; j < 10; i++) {
			if (i % 2 == 0) {
				j++;
				BigDecimal a = new BigDecimal(i + "").setScale(5,BigDecimal.ROUND_HALF_UP);
				System.out.println(a);
			}
		}
		System.out.println("Divided by 3 :");
		for (int i = 0, j = 0; j < 10; i++) {
			if (i % 3 == 0) {
				j++;
				BigDecimal a = new BigDecimal(i + "").setScale(5,BigDecimal.ROUND_HALF_UP);
				System.out.println(a);
			}
		}
	}
}