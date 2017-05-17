import java.io.*;
import java.util.*;

public class ReplaceWordInFile {
    public static void replaceWordInFile(File file,String str, String newS) {
        ArrayList<File> aFile = new ArrayList<>(500);
        aFile.add(file);

        for (int i = 0; i < aFile.size(); i++) {
            File tempFile = aFile.get(i);
            if (tempFile.isFile())
                checkFile(tempFile, str, newS);
            else if (tempFile != null && tempFile.listFiles().length != 0) {
                Collections.addAll(aFile, tempFile.listFiles());
            }

        }
    }

    public static void checkFile(File file,String str, String newS) {
        try (Scanner inFile = new Scanner(file)) {
            while (inFile.hasNext()) {
                if(inFile.nextLine().contains(str)) {
                    System.out.println("Replace file : " + file.getPath());
                    readAndWrite(file, str, newS);
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readAndWrite(File file, String oldS, String newS) throws FileNotFoundException {
        ArrayList<String> tempLine = new ArrayList<>();    //这样做的目的是在写入到文件的时候方便换行。
        try (Scanner filein = new Scanner(file)) {
            while (filein.hasNext()) {
                String str = filein.nextLine();
                if (str.contains(oldS)) {
                    str = replaceWords(str, oldS, newS);
                    tempLine.add(str);
                }
                else {
                    tempLine.add(str);
                }
            }
        }

        //重修写入文件中。
        try (PrintWriter fileout = new PrintWriter(file)) {
            for (String a : tempLine) {
                fileout.println(a);    //利用println完成换行
            }
        }
    }

    public static String replaceWords(String str, String oldS, String newS) {
        str = str.replace(oldS, newS);
        return str;
    }
}
