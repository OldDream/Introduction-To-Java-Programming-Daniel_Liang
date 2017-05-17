import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class FindWordInFile {
    public static void findWordInFile(File file,String str) {
        ArrayList<File> aFile = new ArrayList<>(500);
        aFile.add(file);

        for (int i = 0; i < aFile.size(); i++) {
            File tempFile = aFile.get(i);
            if (tempFile.isFile())
                checkFile(tempFile, str);
            else if (tempFile != null && tempFile.listFiles().length != 0) {
                Collections.addAll(aFile, tempFile.listFiles());
            }

        }
    }

    public static void checkFile(File file,String str) {
        try (Scanner inFile = new Scanner(file)) {
            while (inFile.hasNext()) {
                if(inFile.nextLine().contains(str))
                    System.out.println("File : " + file.getPath());
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}