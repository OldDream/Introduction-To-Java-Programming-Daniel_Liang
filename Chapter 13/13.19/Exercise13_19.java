import java.util.Scanner;

public class Exercise13_19 {
    public static void main(String[] args) {
        System.out.print("Enter a decimal : ");
        Scanner input = new Scanner(System.in);
        String ori = input.nextLine();
        String[] num = ori.split("\\.");
        Rational r1 = new Rational(Integer.parseInt(num[0]), 1);
        Rational r2 = new Rational(Integer.parseInt(num[1]), (int)Math.pow(10, num[1].length()));
        if (Double.parseDouble(ori) < 0 && Math.abs(Double.parseDouble(ori)) < 1)
            r2 = r2.multiply(new Rational(-1, 1));
        Rational r3 = r1.add(r2);

        System.out.println("The fraction number is : " + r3);
    }
}