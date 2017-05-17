import java.util.Scanner;

public class Exercise18_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[8];
        System.out.print("Enter a 8 integers array : ");
        for (int i = 0; i < 8; i++) {
            n[i] = input.nextInt();
        }
        System.out.println("Max is " + FindMaxInArray.findMaxInArray(n));
    }
}