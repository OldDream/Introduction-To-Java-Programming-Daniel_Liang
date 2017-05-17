import java.io.*;
import java.util.*;

public class Exercise17_5 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        Date time = new Date();

        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(
            new FileOutputStream("Exercise17_5.dat")))) {
            out.writeObject(num);
            out.writeObject(time);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}