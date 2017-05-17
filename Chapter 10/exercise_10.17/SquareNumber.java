import java.math.*;

public class SquareNumber {
	public static void main(String[] args) {
		long xx = Long.MAX_VALUE;
		System.out.println("Bigger than " + Long.MAX_VALUE);
		BigInteger s1 = new BigInteger(Long.toString(Long.MAX_VALUE));
		for (long i = (long)Math.sqrt(Long.MAX_VALUE), j = 0; j < 10; i++) {
			BigInteger temp = new BigInteger(Long.toString(i)).multiply(new BigInteger(Long.toString(i)));
			if (temp.compareTo(s1) > 0){
				j++;
				System.out.println(temp);
			}
		}
	}
}