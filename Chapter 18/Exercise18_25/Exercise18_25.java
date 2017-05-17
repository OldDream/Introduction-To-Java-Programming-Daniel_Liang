import java.util.Scanner;

public class Exercise18_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String n = input.next();
        DisplayPermutation.displayPermutation(n);
    }
}