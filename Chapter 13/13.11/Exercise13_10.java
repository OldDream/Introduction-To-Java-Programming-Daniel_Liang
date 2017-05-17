public class Exercise13_10 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon oct1 = new Octagon(1);
        Octagon oct2 = (Octagon)oct1.clone();

        System.out.println("Area : " + oct1.getArea());
        System.out.println("Perimeter : " + oct1.getPerimeter());
        System.out.println("Compare with Colned Obj : " + oct1.compareTo(oct2));
    }
}