public class Test13_14 {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);

        System.out.println((r1.add(r2)).toString());
        System.out.println((r1.subtract(r2)).toString());
        System.out.println((r1.multiply(r2)).toString());
        System.out.println((r1.divide(r2)).toString());
    }
}