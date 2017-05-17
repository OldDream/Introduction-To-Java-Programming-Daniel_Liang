import java.util.Scanner;

public class Exercise18_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Integer : ");
        long i = input.nextLong();
        System.out.println("Sum of digits is " + SumDigits.sumDigits(i));
    }
}