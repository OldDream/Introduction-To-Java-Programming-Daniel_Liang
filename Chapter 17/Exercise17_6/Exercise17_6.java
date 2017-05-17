import java.io.*;
import java.util.*;

public class Exercise17_6 {
    public static void main(String[] args) {
        Loan l1 = new Loan();
        Loan l2 = new Loan(3, 10, 100_000);
        Loan l3 = new Loan(3, 10, 110_000);
        Loan l4 = new Loan(3, 10, 120_000);
        Loan l5 = new Loan(3, 10, 130_000);


        //输出用的。。。
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(
            new FileOutputStream("Exercise17_6.dat")))) {
            out.writeObject(l1);
            out.writeObject(l2);
            out.writeObject(l3);
            out.writeObject(l4);
            out.writeObject(l5);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}