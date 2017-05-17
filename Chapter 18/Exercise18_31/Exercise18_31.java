import java.util.Scanner;
import java.io.File;

public class Exercise18_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a directory: ");
        String fn = input.next();
        System.out.print("Enter the old string: ");
        String oldS = input.next();
        System.out.print("Enter the new string: ");
        String newS = input.next();

        ReplaceWordInFile.replaceWordInFile(new File(fn), oldS, newS);
    }
}