import java.util.*;
import java.io.File;

public class Exercise21_2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input.");
            System.exit(0);
        }

        TreeSet<String> set = new TreeSet<>();

        try (Scanner filein = new Scanner(new File(args[0]))) {
            while (filein.hasNextLine()) {
                String a = filein.nextLine();
                for (String b : a.split("[\\s]+"))
                    set.add(b);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (String a : set) {
            System.out.print(a + "   ");
        }
    }
}