public class ComplexMatrix extends GenericMatrix<Complex> {
    protected Complex add(Complex o1, Complex o2) {
        return o1.add(o2);
    }

    protected Complex multiply(Complex o1, Complex o2) {
        return o1.multiply(o2);
    }

    protected Complex zero() {
        return new Complex(0, 0);
    }
}