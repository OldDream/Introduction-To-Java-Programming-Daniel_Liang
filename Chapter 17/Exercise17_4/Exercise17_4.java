import java.io.*;
import java.math.*;


public class Exercise17_4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        if (args.length != 2) {
            System.out.println("Wrong input !");
            System.exit(1);
        }

        //按行读进
        try (DataInputStream in = new DataInputStream(
            new BufferedInputStream(new FileInputStream(args[0])))) {
            sb.append(in.readLine() + "\n");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        //输出为UTF-8
        try (DataOutputStream out = new DataOutputStream(
            new BufferedOutputStream(new FileOutputStream(args[1])))) {
            out.writeUTF(sb.toString());
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(args[0] + " size is " + new File(args[0]).length() + " Bytes.");
        System.out.println(args[1] + " size is " + new File(args[1]).length() + " Bytes.");
    }   
}