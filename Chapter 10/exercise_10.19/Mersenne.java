import java.math.*;

public class Mersenne {
	public static void main(String[] args) {
		BigInteger s1 = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger one = new BigInteger("1");
		for (int i = 0; i <=100; i++) {
			s1 = (s1.multiply(two));
			BigInteger temp = s1.subtract(one);
			if (temp.isProbablePrime(10)) {
				System.out.println("true : " + s1);
			}
		}
	}
}