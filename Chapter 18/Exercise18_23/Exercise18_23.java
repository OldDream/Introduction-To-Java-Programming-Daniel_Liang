import java.util.Scanner;

public class Exercise18_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        String n = input.next();
        System.out.println("Number in dec: " + Bin2Dec.bin2Dec(n));
    }
}