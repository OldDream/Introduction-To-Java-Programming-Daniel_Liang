import java.io.*;
import java.util.Scanner;

public class Exercsie17_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter scource file : ");
        String sfileName = input.nextLine();
        System.out.print("Enter output file : ");
        String ofileName = input.nextLine();

        File sfile = new File(sfileName);
        File ofile = new File(ofileName);

        if (!sfile.exists()) {
            System.out.println("Can't find source file.");
            System.exit(1);
        }
        if (ofile.exists()) {
            System.out.println("Output file already exist.");
            System.exit(1);
        }

        encription(sfile, ofile);
    }

    public static void encription(File sfile, File ofile) {
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(sfile)));
             DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(ofile)))) {
            while (true) {
                int i = in.read();
                if (i != -1)
                    out.write(i + 5);
                else
                    break;
            }
            System.out.println("Success!");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}