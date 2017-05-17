import java.util.*;
import java.io.*;

public class Exercise20_1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input.");
            System.exit(1);
        }
        File file = new File(args[0]);
        readAndPrint(file);
    }

    public static void readAndPrint(File file) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext())
                list.add(input.next());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        Collections.sort(list);
        System.out.println(list);
    }
}