import java.math.*;

public class Test13_15 {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);
        Rational r3 = new Rational(1, -3);

        System.out.println("r1 + r2 " + (r1.add(r2)).toString());
        System.out.println("r3 - r1 " + (r3.subtract(r1)).toString());
        System.out.println("r1 - r2 " + (r1.subtract(r2)).toString());
        System.out.println("r1 * r2 " + (r1.multiply(r2)).toString());
        System.out.println("r1 / r2 " + (r1.divide(r2)).toString());
        System.out.println("r3.compareTo(r1) " + r3.compareTo(r1));
        System.out.println("r3 is " + r3.toString());

    }
}