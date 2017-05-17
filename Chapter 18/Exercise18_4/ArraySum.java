public class ArraySum {
    public static Rational arraySum(int n) {
        if (n == 1)
            return new Rational(1, 1);
        else {
            return new Rational(1, n).add(arraySum(n - 1));
        }
    }
}