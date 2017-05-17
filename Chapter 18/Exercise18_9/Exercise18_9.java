import java.util.Scanner;

public class Exercise18_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String i = input.next();
        ReverseDisplay.reverseDisplay(i);
    }
}