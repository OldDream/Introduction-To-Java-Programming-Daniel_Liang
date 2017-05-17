public class Exercise13_9 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);

        if (c1.compareTo(c2) > 0)
            System.out.println("C1 > C2");
        else if (c1.compareTo(c2) == 0)
            System.out.println("C1 = C2");
        else
            System.out.println("C1 < C2");
    }
}