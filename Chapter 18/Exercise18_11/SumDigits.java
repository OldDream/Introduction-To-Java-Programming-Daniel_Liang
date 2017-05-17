public class SumDigits {
    public static int sumDigits(long n) {
        return sumDigits(n, 0);
    }

    public static int sumDigits(long n, int sum) {
        if (n == 0)
            return sum;
        else {
            sum += n % 10;
            n /= 10;
            return sumDigits(n, sum);
        }
    }
}