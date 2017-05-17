import java.io.*;
import java.util.*;

public class Exercise17_7 {
    public static void main(String[] args) {
        Loan l1 = null;
        double sum = 0;
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(
            new FileInputStream("Exercise17_6.dat")))) {
            while(true) {
                Object o = in.readObject();
                if (o instanceof Loan)
                    sum += ((Loan)o).getLoanAmount();
            }
        }
        catch (EOFException ex) {
            System.out.println("EOF");
        }
        catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println("The total LoanAmount is " + sum);

    }
}