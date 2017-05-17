import java.util.*;
import java.io.*;

public class Exercise21_10 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input.");
            System.exit(0);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + file.getName() + " does not exist");
            System.exit(0);
        }

        HashMap<String, Integer> map = new HashMap<>();
        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));

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
                            while (!strArray[i].matches(".*\".*")) {
                                i++;    //空语句
                            }
                    }
                    else if (map.containsKey(strArray[i])) {
                        Integer num = map.get(strArray[i]) + 1;
                        map.put(strArray[i], num);
                    }
                    else if (keywordSet.contains(strArray[i])){
                        map.put(strArray[i], 1);
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        Set<Map.Entry<String, Integer>> eSet = map.entrySet();

        for (Map.Entry<String, Integer> a : eSet) {
            System.out.println(a.getKey() + "\t" + a.getValue());
        }
    }

    private static String insertBlanks(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.contains("\\\""))
            str.replace("\\\"", " ");
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

    private static String[] keywordString = {"abstract", "assert", "boolean",
                        "break", "byte", "case", "catch", "char", "class", "const",
                        "continue", "default", "do", "double", "else", "enum",
                        "extends", "for", "final", "finally", "float", "goto",
                        "if", "implements", "import", "instanceof", "int",
                        "interface", "long", "native", "new", "package", "private",
                        "protected", "public", "return", "short", "static",
                        "strictfp", "super", "switch", "synchronized", "this",
                        "throw", "throws", "transient", "try", "void", "volatile",
                        "while", "true", "false", "null"};
}