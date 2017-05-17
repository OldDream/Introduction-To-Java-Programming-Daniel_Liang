import java.util.Scanner;

public class Exercise18_3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("a : ");
       int a = input.nextInt();
       System.out.print("b : ");
       int b = input.nextInt();

       int gcd = GCD.gcd(a, b);

       System.out.println("GCD of " + a + " and " + b + " is " + gcd);
    }
}