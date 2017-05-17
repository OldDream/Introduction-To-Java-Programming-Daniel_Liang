import java.io.File;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Collections;

public class DirectorySizeWithOutRecursion {
  public static void main(String[] args) {
    // Prompt the user to enter a directory or a file
    System.out.print("Enter a directory or a file: ");    
    Scanner input = new Scanner(System.in);
    String directory = input.nextLine();
    
    // Display the size
    System.out.println(getSize(new File(directory)) + " bytes");
  }

  public static long getSize(File file) {
    long size = 0; // Store the total size of all files

    if (file == null || (!file.isDirectory() && !file.isFile())) {
      System.out.println("Invalid file.");
      System.exit(1);
    }

    ArrayList<File> aFile = new ArrayList<>(500);
    aFile.add(file);
    for (int i = 0; i < aFile.size(); i++) {
      File temp = aFile.get(i);
      if (temp.isFile())
        size += temp.length();
      else if (temp.listFiles() != null && temp.listFiles().length != 0)
         Collections.addAll(aFile, temp.listFiles());
    }
    return size;
  }
}
