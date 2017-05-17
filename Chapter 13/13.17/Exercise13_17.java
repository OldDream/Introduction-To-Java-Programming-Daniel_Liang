import java.util.Scanner;

public class Exercise13_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first complex number : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex c1 = new Complex(a, b);
        System.out.print("Enter second complex number : ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex c2 = new Complex(c, d);

        System.out.println("Add " + c1.add(c2));
        System.out.println("Substract " + c1.substract(c2));
        System.out.println("Multiply " + c1.multiply(c2));
        System.out.println("Divide " + c1.divide(c2));
        System.out.println("ABS " + c1.abs());
    }
}