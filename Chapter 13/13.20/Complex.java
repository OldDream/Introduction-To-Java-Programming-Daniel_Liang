public class Complex implements Cloneable{
    public Complex() {
    }


    public Complex(double a) {
        this.a = a;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private double a = 0, b = 0;

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex another) {
        return new Complex(a + another.getRealPart(), b + another.getImaginaryPart());
    }

    public Complex substract(Complex another) {
        return new Complex(a - another.getRealPart(), b - another.getImaginaryPart());
    }

    public Complex multiply(Complex another) {
        double ax = a * another.getRealPart() - b * another.getImaginaryPart();
        double bx = b * another.getRealPart() + a * another.getImaginaryPart();

        return new Complex(ax, bx);
    }

    public Complex divide(Complex another) {
        double ax = (a * another.getRealPart() + b * another.getImaginaryPart())
                / (Math.pow(another.getRealPart(), 2) + Math.pow(another.getImaginaryPart(), 2));
        double bx = (b * another.getRealPart() - a * another.getImaginaryPart())
                / (Math.pow(another.getRealPart(), 2) + Math.pow(another.getImaginaryPart(), 2));

        return new Complex(ax, bx);
    }

    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return a + " + " + b + "i";
    }
}