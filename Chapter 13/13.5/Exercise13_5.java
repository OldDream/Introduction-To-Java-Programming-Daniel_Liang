public class Exercise13_5 {
    public static void main(String[] args) throws IllegalTriangleException {
        Triangle tr1 = new Triangle(3, 4, 5);
        Triangle tr2 = new Triangle(6, 7, 8);

        System.out.println(GeometricObject.findMax(tr1, tr2).toString());
    }
}