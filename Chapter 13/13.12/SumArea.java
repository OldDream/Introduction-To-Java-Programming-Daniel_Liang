public abstract class SumArea {
    public static double sumArea(GeometricObject[] a) {
        double area = 0;
        for(GeometricObject temp : a) {
            area += temp.getArea();
        }
        return area;
    }
}