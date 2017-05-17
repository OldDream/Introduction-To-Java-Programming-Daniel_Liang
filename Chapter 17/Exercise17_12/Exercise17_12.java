import java.io.*;

public class Exercise17_12 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Wrong input !");
            System.exit(1);
        }

        for (int i = 0; i < args.length - 1; i++) {
            if (!new File(args[i]).exists()) {
                System.out.println(args[i] + " Not Exist !");
                System.exit(1);
            }
        }

        int number = args.length - 1;

        if (new File(args[number]).exists()) {
            System.out.println("Target File Already Exist !");
            System.exit(1);
        }

        for (int i = 0; i < args.length - 1; i++) {
            try (RandomAccessFile fileout = new RandomAccessFile(args[number], "rw");
                 RandomAccessFile filein = new RandomAccessFile(args[i], "r")) {
                fileout.seek(fileout.length());    //Recover the right position of Pointer.
                for (long j = 0; j < filein.length(); j++) {
                    fileout.write(filein.read());
                }
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }

       


    }
}