import java.util.Scanner;

public class Exercise13_21 extends DoubleToRational {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a b c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double h = -b / (2 * a);
        double k = (4 * a * c - b * b) / (4 * a);

        System.out.println("h is " + doubleToRational(h) + " k is " + doubleToRational(k));
    } 
}