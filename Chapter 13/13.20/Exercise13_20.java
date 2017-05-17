import java.util.Scanner;

public class Exercise13_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a b c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if ((b * b - 4 * a * c) >= 0) {
            double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("r1 = " + r1 + " r2 = " + r2);
        }
        else {
            double d = b * b - 4 * a * c;
            d = Math.sqrt(Math.abs(d)) / (2 * a);
            double e = -b / (2 * a);
            Complex c1 = new Complex(e, d);
            Complex c2 = new Complex(e, -d);
            System.out.println("r1 = " + c1 + " r2 = " + c2);
        }
    }
}