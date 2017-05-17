import java.util.Scanner;

public class Exercise18_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a index : ");
        int n = input.nextInt();

        long result = Fibonacci.getFibonacci(n);
        System.out.println("Result : " + result);
    }

}