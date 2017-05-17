import java.util.Scanner;
import java.io.File;

public class Exercise18_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a directory: ");
        String fn = input.next();
        System.out.print("Enter the old string: ");
        String key = input.next();


        FindWordInFile.findWordInFile(new File(fn), key);
    }
}