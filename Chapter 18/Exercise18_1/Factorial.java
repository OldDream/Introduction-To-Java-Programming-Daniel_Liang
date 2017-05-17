import java.math.*;

public class Factorial {
    public static BigInteger Factorial(BigInteger num) {
        return Factorial(num, new BigInteger("1"));
    }


    public static BigInteger Factorial(BigInteger num, BigInteger result) {
        if (num.compareTo(new BigInteger("1")) > 0) {
            result = result.multiply(num);
            return Factorial(num.subtract(new BigInteger("1")), result);
        }
        else if (num.compareTo(new BigInteger("1")) == 0)
            return result;
        else
            return new BigInteger("0");
    }
}