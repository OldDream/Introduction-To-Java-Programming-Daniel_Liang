import java.util.*;
import java.io.*;

public class Exercise21_8 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input.");
            System.exit(0);
        }

        TreeMap<String, Integer> tree = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                String[] array = temp.split("[\\s,;.:\\?'\"\\(\\)]");
                for (String a : array) {
                    a = a.toLowerCase();
                    if (!Character.isLetter(a.charAt(0))) {
                        continue;
                    }
                    if (tree.get(a) == null) {
                        tree.put(a, 1);
                    }
                    else {
                        int value = tree.get(a);
                        value++;
                        tree.put(a, value);
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        Set<Map.Entry<String, Integer>> entrySet = tree.entrySet();

        for (Map.Entry<String, Integer> entry: entrySet)
            System.out.println(entry.getValue() + "\t" + entry.getKey());

    }   
}