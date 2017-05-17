public class Exercise13_18 {
    public static void main(String[] args) {
        Rational result = new Rational();
        for (long i = 1; i < 100; i++) {
            Rational t1 = new Rational(i, i + 1);
            result = result.add(t1);
        }

        System.out.println("result is " + result.toString());
    }
}