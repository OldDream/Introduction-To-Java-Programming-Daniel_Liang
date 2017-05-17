import java.util.Scanner;
import java.math.*;

public class Exercise18_1 {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner input = new Scanner(System.in);
        String numStr = input.next();
        System.out.println(numStr + "! = " + 
            Factorial.Factorial(new BigInteger(numStr)));
    }
}