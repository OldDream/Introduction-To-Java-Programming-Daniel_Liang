public class ArraySum {
    public static Rational arraySum(int n) {
        if (n == 1)
            return new Rational(n, n + 1);
        else {
            return new Rational(n, n + 1).add(arraySum(n - 1));
        }
    }
}