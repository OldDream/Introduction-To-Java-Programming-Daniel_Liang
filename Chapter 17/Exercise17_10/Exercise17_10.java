import java.io.*;

public class Exercise17_10 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong input !");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File not exist !");
            System.exit(1);
        }

        long size = file.length() / Long.parseLong(args[1]);
        if (size * Long.parseLong(args[1]) != file.length())
            size += 1;

        for (int i = 0; i < Integer.parseInt(args[1]); i++) {
            String outputFile = args[0] + "." + (i + 1);
            if (new File(outputFile).exists()) {
                System.out.println("Outputfile already exist !");
                System.exit(1);
            }
        }

        Blong pointerPosition = 0;    //标记好指针的位置。
        for (int i = 0; i < Integer.parseInt(args[1]); i++) {
            String outputFile = args[0] + "." + (i + 1);
            try (RandomAccessFile filein = new RandomAccessFile(file, "r");
                 DataOutputStream fileout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outputFile)))) {
                filein.seek(pointerPosition);    //Recover the right position of Pointer.
                for (long j = 0; j < size; j++) {
                    fileout.write(filein.read());
                }

                pointerPosition = filein.getFilePointer();    //Save the position of Pointer.
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }

       


    }
}