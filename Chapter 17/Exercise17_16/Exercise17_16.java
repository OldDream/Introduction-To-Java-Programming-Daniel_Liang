import java.util.*;
import java.io.*;

public class Exercise17_16 {
    public static void main(String[] args) {
        System.out.print("Enter a file name : ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File doesn't exist!");
            System.exit(1);
        }
        counter(file);
    }

    public static void counter(File file) {
        ArrayList<Character> arl1 = new ArrayList<>();    // Save chars.
        ArrayList<Integer> arl2 = new ArrayList<>();    //Save the number of the appearance of char.
     
        try (DataInputStream filein = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                int tempInt = filein.read();
                if (tempInt == -1)
                    break;    //EOF, break the loop.
                char tempChar = (char)tempInt;
                if (arl1.size() == 0) {
                    arl1.add(tempChar);
                    arl2.add(1);
                }
                else if (arl1.contains(tempChar)) {
                    int index = arl1.indexOf(tempChar);
                    arl2.set(index, arl2.get(index) + 1);
                    System.out.println("     " + tempChar + " +1");
                }
                else {
                    arl1.add(tempChar);
                    arl2.add(1);
                    System.out.println("Find " + tempChar);
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }  

        //print result.
        for (int i = 0; i < arl1.size(); i++) {
            System.out.println("Character : " + arl1.get(i) + "   " + arl2.get(i));
        }

    }
}