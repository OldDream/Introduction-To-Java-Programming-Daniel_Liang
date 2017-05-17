import java.io.*;
import java.math.*;

public class Exercise17_2 {
    public static void main(String[] args) {
            File file = new File("Exercise17_2.dat");
            StringBuilder sb = new StringBuilder();

            if (file.exists()) {
                try (FileOutputStream raf = new FileOutputStream(file, true)) {
                    for (int i = 0; i < 100; i++) {
                        int j = (int)(Math.random() * 1000);
                        raf.write(j);
                        raf.write(" ".getBytes());
                    }
                    
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            else {
                try (FileOutputStream raf = new FileOutputStream(file, true)) {
                    for (int i = 0; i < 100; i++) {
                        int j = (int)(Math.random() * 1000);
                        raf.write(j);
                        raf.write(" ".getBytes());
                    }
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            //再把他们读进来
            try (FileInputStream raf = new FileInputStream(file)) {
                int i;
                while ((i = raf.read()) != -1)
                    System.out.print(i + " ");
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
            finally {
                System.out.println();
            }
    }   
}