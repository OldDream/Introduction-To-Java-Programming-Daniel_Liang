public abstract class DoubleToRational {

    public static Rational doubleToRational(double ori) {
        String[] num = (ori + "").split("\\.");
        Rational r1 = new Rational(Integer.parseInt(num[0]), 1);
        Rational r2 = new Rational(Integer.parseInt(num[1]), (int)Math.pow(10, num[1].length()));
        if (ori < 0 && Math.abs(ori) < 1)
            r2 = r2.multiply(new Rational(-1, 1));
        Rational r3 = r1.add(r2);

        return r3;
    }
}