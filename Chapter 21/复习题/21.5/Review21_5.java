import java.util.*;

public class Review21_5 {
    public static void main(String[] args) {
        Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
        set.add(new Circle(4.5));
        set.add(new Rectangle(4.4, 1));
        set.add(new Circle(6.5));
        set.add(new Rectangle(4, 5));
        //set.add("666");

        for (GeometricObject o : set) {
            System.out.println("Size : " + o.getArea());
        }
    }
}
