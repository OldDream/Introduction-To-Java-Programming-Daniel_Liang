import java.math.*;

public class Rational extends Number implements Comparable {
  // Data fields for numerator and denominator
  private BigInteger numerator = null;
  private BigInteger denominator = null;

  /** Construct a rational with default properties */
  public Rational() {
    this(new BigInteger("0"),new BigInteger("1"));
  }

  /** Construct a rational with specified numerator and denominator */
  public Rational(BigInteger numerator, BigInteger denominator) {
    BigInteger gcd = numerator.gcd(denominator).abs();
    this.numerator = (((denominator.compareTo(new BigInteger("0")) > 0) ? new BigInteger("1") : new BigInteger("-1"))
                  .multiply(numerator).divide(gcd));
    this.denominator = (denominator.abs().divide(gcd));
  }

  public Rational(long num, long den) {
    BigInteger numerator = new BigInteger("" + num);
    BigInteger denominator = new BigInteger("" + den);
    BigInteger gcd = numerator.gcd(denominator);
    this.numerator = (((den > 0) ? new BigInteger("1") : new BigInteger("-1")).multiply(numerator).divide(gcd));
    this.denominator = (denominator.abs().divide(gcd));
  }

  /** Return numerator */
  public BigInteger getNumerator() {
    return numerator;
  }

  /** Return denominator */
  public BigInteger getDenominator() {
    return denominator;
  }

  /** Add a rational number to this rational */
  public Rational add(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator())
                    .add(denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Subtract a rational number from this rational */
  public Rational subtract(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Multiply a rational number to this rational */
  public Rational multiply(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getNumerator());
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Divide a rational number from this rational */
  public Rational divide(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator());
    BigInteger d = denominator.multiply(secondRational.getNumerator());
    return new Rational(n, d);
  }

  /** Override the toString() method */
  public String toString() {
    if (denominator.intValue() == 1)
      return numerator.toString();
    else
      return numerator.toString() + " / " + denominator.toString();
  }

  /** Override the equals method in the Object class */
  public boolean equals(Object parm1) {
    if ((this.subtract((Rational)(parm1))).getNumerator().intValue() == 0)
      return true;
    else
      return false;
  }

  /** Override the abstract intValue method in java.lang.Number */
  public int intValue() {
    return (int)doubleValue();
  }

  /** Override the abstract floatValue method in java.lang.Number */
  public float floatValue() {
    return (float)doubleValue();
  }

  /** Override the doubleValue method in java.lang.Number */
  public double doubleValue() {
    return numerator.doubleValue() / denominator.doubleValue();
  }

  /** Override the abstract longValue method in java.lang.Number */
  public long longValue() {
    return (long)doubleValue();
  }

  /** Override the compareTo method in java.lang.Comparable */
  @Override
  public int compareTo(Object o) {
    if ((this.subtract((Rational)o)).getNumerator().doubleValue() > 0)
      return 1;
    else if ((this.subtract((Rational)o)).getNumerator().doubleValue() < 0)
      return -1;
    else
      return 0;
  }
}
