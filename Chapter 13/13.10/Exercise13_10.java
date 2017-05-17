public class Exercise13_10 {
    public static void main(String[] args) {
        Rectangle c1 = new Rectangle(3, 5);
        Rectangle c2 = new Rectangle(5, 10);

        if (c1.compareTo(c2) > 0)
            System.out.println("C1 > C2");
        else if (c1.compareTo(c2) == 0)
            System.out.println("C1 = C2");
        else
            System.out.println("C1 < C2");
    }
}