import java.util.Scanner;

public class Exercise18_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String i = input.next();
        System.out.println("Number of Uppercase character is " +
         CountUpperCaseInArray.countUpperCaseInArray(i.toCharArray()));
    }
}