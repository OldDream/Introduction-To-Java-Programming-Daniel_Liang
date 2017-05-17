public class GCD {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        //保证顺序
        if (a < b) {
            int temp = b;
            b = a;
            a = temp;
        }

        if (a % b != 0) {
            return gcd(b, a % b);
        }
        else
            return b;
    }
}