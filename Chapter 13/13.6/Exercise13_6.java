public class Exercise13_6 {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3);
        ComparableCircle c2 = new ComparableCircle(5);

        if (c1.compareTo(c2) > 0)
            System.out.println("C1 > C2");
        else if (c1.compareTo(c2) == 0)
            System.out.println("C1 = C2");
        else
            System.out.println("C1 < C2");
    }
}