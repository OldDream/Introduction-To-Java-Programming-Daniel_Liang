import java.io.*;

public class Exercise17_8 {
    public static void main(String[] args) {
        int i = 0;
        File file = new File("Exercise17_8.dat");
        if (!file.exists()) {
            try (RandomAccessFile in = new RandomAccessFile("Exercise17_8.dat", "rw")) {
                in.writeInt(i);
            }
            catch(IOException ex) {
                ex.printStackTrace();
            }

            System.out.println("Runed " + i + " times.");
            System.exit(0);
        }

        try (RandomAccessFile in = new RandomAccessFile("Exercise17_8.dat", "rw")) {
            i = in.readInt();
            i++;
            in.setLength(0);
            in.writeInt(i);
        }
        catch(EOFException ex) {
            ex.printStackTrace();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Runed " + i + " times.");
    }
}