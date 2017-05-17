import java.math.*;

public class exercise_10_21 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger(Long.MAX_VALUE + "");
		System.out.println("Divided by 5 or 6 :");
		for (int i = 0, j = 0; j < 10; i++) {
			if (dividedEvenly(a)) {
				j++;
				System.out.println(a);
			}
			a = a.add(BigInteger.ONE);
		}
	}

	public static boolean dividedEvenly(BigInteger in) {
		BigInteger temp = in.divide(new BigInteger("5"));
		if (temp.multiply(new BigInteger("5")).compareTo(in) == 0)
			return true;
		else if ((temp.multiply(new BigInteger("6")).compareTo(in) == 0))
			return true;
		else
			return false;
	}
}