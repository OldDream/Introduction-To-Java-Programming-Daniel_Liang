import java.util.*;
import java.io.*;

public class Exercise21_3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input.");
            System.exit(0);
        }

        HashSet<String> set = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                temp = insertBlanks(temp);
                String[] strArray = temp.split("[[\\s]+(){}\\[\\]\\.;!=<>:]");
                for (int i = 0; i < strArray.length; i++) {
                    if (strArray[i].contains("//")) {
                        System.out.println("捕捉到行注释");
                        break;
                    }
                    else if (strArray[i].length() == 0)
                        continue;
                    else if (strArray[i].matches(".*/\\*.*")) {
                        System.out.println("捕捉到块注释");
                        while (!strArray[++i].matches(".*\\*/.*")) {
                            ;    //空语句
                        }
                    }
                    else if (strArray[i].matches(".*\".*")) {
                        System.out.println("捕捉到\"\"。");
                        while (!strArray[++i].matches(".*\".*")) {
                            ;    //空语句
                        }
                    }
                    else
                        set.add(strArray[i]);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (String a : set) {
            System.out.println(a);
        }
    }

    public static String insertBlanks(String str) {
        StringBuilder sb = new StringBuilder();
        for (char a : str.toCharArray()) {
            if ((a + "").matches("[+(){}\\[\\]\\.;!=<>:\"]")) {
                sb.append(" ");
                sb.append(a + "");
                sb.append(" ");
            }
            else {
                sb.append(a + "");
            }
        }
        return sb.toString();
    }
}

