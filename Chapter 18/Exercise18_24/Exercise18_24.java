import java.util.Scanner;

public class Exercise18_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Hex number : ");
        String n = input.next();
        System.out.println("Number in dec: " + Hex2Dec.hex2Dec(n));
    }
}