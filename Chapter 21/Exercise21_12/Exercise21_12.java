import java.io.*;
import java.util.*;

public class Exercise21_12 {
    public static void main(String[] args) {
        Set<String> male = new HashSet<>();
        Set<String> female = new HashSet<>();
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename : ");
        File file = new File(input.next());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                String[] array = temp.split("\\s+");
                male.add(array[1]);
                female.add(array[3]);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(male.size() + "   " + female.size());
        male.retainAll(female);

        System.out.println("num : " + male.size());
        System.out.println("They are : ");
        for (String a : male) {
            System.out.println(a);
        }
        System.out.println();


    }
}