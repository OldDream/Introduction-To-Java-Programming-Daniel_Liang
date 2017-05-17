import java.io.*;
import java.util.Scanner;

public class Exercise17_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename : ");
        File file = new File(input.nextLine());
        System.out.print("File: ");
        System.out.println(getBits(file));
    }

    public static String getBits(File file) {
        StringBuilder sb = new StringBuilder();

        try (DataInputStream bitin = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                int temp = bitin.read();
                if(temp == -1) {
                    sb.deleteCharAt(0);
                    return sb.toString();
                }
                StringBuilder tempSb = new StringBuilder(Integer.toHexString(temp));
                tempSb.insert(0, " 0x");
                sb.append(tempSb);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }
}