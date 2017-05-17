import java.util.Scanner;

public class Exercise18_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String i = input.next();
        System.out.print("Enter a Char : ");
        char j = input.next().charAt(0);
        System.out.println(Count.count(i, j));
    }
}