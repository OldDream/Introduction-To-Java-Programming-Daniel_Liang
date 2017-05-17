import java.util.*;
import java.io.*;

public class Exercise21_4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input.");
            System.exit(0);
        }

        int vowel = 0, consonant = 0;
        Character[] charArray = {'A','E','I','O','U'};
        Set<Character> set = new HashSet<>(Arrays.asList(charArray));

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                for (char a : temp.toCharArray()) {
                    if (set.contains(Character.toUpperCase(a)))
                        vowel++;
                    else if (Character.isLetter(a))
                        consonant++;
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("vowel : " + vowel + " consonant : " + consonant);

    }
}