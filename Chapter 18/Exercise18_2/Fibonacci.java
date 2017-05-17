public class Fibonacci {
    public static long getFibonacci(int index) {
        long f0 =0, f1 = 1;
        if (index == 0)
            return f0;
        else if (index == 1)
            return f1;
        else {
            for (int i = 1; i < index; i++) {
                long currentFib = f0 + f1;
                f0 = f1;
                f1 = currentFib;
            }
            return f1;
        }
    }
}