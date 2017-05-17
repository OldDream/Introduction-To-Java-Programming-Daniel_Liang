public class Exercise13_12 extends SumArea {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        Rectangle r1 = new Rectangle(1, 2);
        Rectangle r2 = new Rectangle(2, 3);
        GeometricObject[] a = {c1, c2, r1, r2};
        System.out.println("Area is " + sumArea(a));
    }
}