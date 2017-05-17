import java.io.*;
import java.math.*;

public class Exercise17_3 {
    public static void main(String[] args) {
            File file = new File("Exercise17_03.dat");
            StringBuilder sb = new StringBuilder();

            if (file.exists()) {
                try (DataOutputStream raf = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file, true)))) {
                    for (int i = 0; i < 10; i++) {
                        int j = (int)(Math.random() * 101);
                        raf.writeInt(j);
                    }
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            else {
                try (DataOutputStream raf = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file, true)))) {
                    for (int i = 0; i < 10; i++) {
                        int j = (int)(Math.random() * 101);
                        raf.writeInt(j);
                    }
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            //再把他们读进来
            int sum = 0;
            try (DataInputStream raf = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
                int i = 0;
                while (true) {
                    i = raf.readInt();
                    System.out.print(i + " ");
                    sum += i;
                }
            }
            catch (EOFException ex) {
                System.out.println("END");
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
            finally {
                System.out.println("Sum is " + sum);
            }
    }   
}