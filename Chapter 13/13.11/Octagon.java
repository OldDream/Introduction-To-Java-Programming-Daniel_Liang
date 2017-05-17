public class Octagon extends GeometricObject implements Cloneable, Comparable {
    //假设是正八边形
    double side = -1;

    public Octagon() {
        this(1);
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return side * 8;
    }

    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public int compareTo(Object o) {
        Octagon oc = (Octagon)o;
        if (getArea() > oc.getArea())
            return 1;
        else if (getArea() < oc.getArea()) 
            return -1;
        else
            return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}