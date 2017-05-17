import java.util.Scanner;

public class Exercise18_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        System.out.println("Number in Bin: " + Dec2Bin.dec2Bin(n));
    }
}