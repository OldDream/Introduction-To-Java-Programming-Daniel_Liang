import java.io.*;
import java.math.*;

public class Exercise17_1 {
    public static void main(String[] args) {
            File file = new File("C:\\aaa\\Exercise17_1.txt");
            File dir = new File("C:\\aaa");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                sb.append((int)(Math.random() * 1000) + " ");
            }
            if (file.exists()) {
                try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
                    raf.writeChars(sb.toString());
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }  
            }
            else {
                dir.mkdirs();
                try (PrintWriter pw = new PrintWriter(file)) {
                    pw.print(sb.toString());
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
    }   
}