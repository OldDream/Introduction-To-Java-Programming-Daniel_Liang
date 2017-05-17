import java.util.Scanner;

public class Exercise18_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter char[] : ");
        String i = input.next();
        System.out.print("Enter a Char : ");
        char j = input.next().charAt(0);
        System.out.println(CountSpecificCharacter.count(i.toCharArray(), j));
    }
}