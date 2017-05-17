import java.math.*;

public class excited_10_18 {
	public static void main(String[] args) {
		System.out.println("Bigger than " + Long.MAX_VALUE);
		BigInteger s1 = new BigInteger(Long.MAX_VALUE + "");
		for (int i = 0; i < 5; i++) {
			s1 = s1.nextProbablePrime();
			System.out.println(s1);
		}
	}
}