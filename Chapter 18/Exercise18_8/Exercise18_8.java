import java.util.Scanner;

public class Exercise18_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int i = input.nextInt();
        ReverseDisplay.reverseDisplay(i);
    }
}